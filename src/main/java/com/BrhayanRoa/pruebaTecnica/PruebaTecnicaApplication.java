package com.BrhayanRoa.pruebaTecnica;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BrhayanRoa.pruebaTecnica.CustomException.DuplicateNameException;
import com.BrhayanRoa.pruebaTecnica.Dto.Spell;
import com.BrhayanRoa.pruebaTecnica.Service.SpellService;

@SpringBootApplication

public class PruebaTecnicaApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}

	
	
	
}
