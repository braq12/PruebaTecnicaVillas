package com.BrhayanRoa.pruebaTecnica.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BrhayanRoa.pruebaTecnica.CustomException.DuplicateNameException;
import com.BrhayanRoa.pruebaTecnica.Dto.Spell;
import com.BrhayanRoa.pruebaTecnica.Service.SpellService;

@RestController
@RequestMapping("/harrypotter/Spells")
public class SpellController {
	
	@Autowired
	SpellService service;

	@GetMapping("/all")
	public List<Spell> all() {
		return service.getSpells();
	}
	@GetMapping
	public List<Spell> byTypeLight(@RequestParam(required = true)  String Type, @RequestParam(required = false) String light) {
		
		return service.getSpellsByTypeLight(Type,light);
	}
	
	@PostMapping
	public ResponseEntity<List<Spell>> createSpell(@Valid @RequestBody Spell spell) throws DuplicateNameException{
		
		
		return new ResponseEntity<List<Spell>>(service.createSpell(spell),HttpStatus.CREATED);
		
		
	}
}
