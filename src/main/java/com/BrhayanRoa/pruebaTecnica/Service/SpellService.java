package com.BrhayanRoa.pruebaTecnica.Service;

import java.util.List;

import com.BrhayanRoa.pruebaTecnica.CustomException.DuplicateNameException;
import com.BrhayanRoa.pruebaTecnica.Dto.Spell;

public interface SpellService {
	
	List<Spell>  getSpells();
	
	List<Spell>  getSpellsByTypeLight(String type, String Light);
	
	List<Spell>  createSpell(Spell spell) throws DuplicateNameException;

}
