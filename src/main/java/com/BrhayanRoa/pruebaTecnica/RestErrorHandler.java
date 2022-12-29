package com.BrhayanRoa.pruebaTecnica;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.BrhayanRoa.pruebaTecnica.CustomException.DuplicateNameException;
import com.google.gson.Gson;

@ControllerAdvice
public class RestErrorHandler extends ResponseEntityExceptionHandler {
	@Autowired
	Gson gson;

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		BindingResult result = ex.getBindingResult();
		Map<String, Object> body = new LinkedHashMap<>();
		List<String> Errors = result.getFieldErrors().stream().map(f -> f.getDefaultMessage())
				.collect(Collectors.toList());
		body.put("timestamp", new Date());
		body.put("status", status.value());
		body.put("Errores", Errors);
		

		return handleExceptionInternal(ex, body, new HttpHeaders(), status, request);
	}

	@ExceptionHandler({ DuplicateNameException.class })
	protected ResponseEntity<Object> handleConflict(DuplicateNameException ex, WebRequest request) {
		String bodyOfResponse = ex.getMessage();
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", new Date());
		body.put("status", 409);
		body.put("Errores", bodyOfResponse);
		return handleExceptionInternal(ex, body, new HttpHeaders(), HttpStatus.CONFLICT, request);
	}

}
