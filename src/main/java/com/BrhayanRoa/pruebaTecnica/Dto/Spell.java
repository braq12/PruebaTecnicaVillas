package com.BrhayanRoa.pruebaTecnica.Dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Spell {
	
	@NotNull(message = "Campo Id Requerido")
	 private String id;
	@NotNull(message = "Campo name Requerido")
	 private String name;
	@NotNull(message = "Campo incantation Requerido")
	 private String incantation;
	@NotNull(message = "Campo effect Requerido")
	 private String effect;
	@NotNull(message = "Campo canBeVerbal Requerido")
	@Pattern(regexp = "^(true|false)$" , message = "El Campo canBeVerbal debe ser true o false")
	 private String canBeVerbal;
	@NotNull(message = "Campo type Requerido")
	 private String type;
	@NotNull(message = "Campo light Requerido")
	@Pattern(regexp = "^(Blue|Red)$" , message = "El Campo light debe ser Blue o Red")
	 private String light;
	 private String creator;
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIncantation() {
		return incantation;
	}
	public void setIncantation(String incantation) {
		this.incantation = incantation;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public boolean isCanBeVerbal() {
		return Boolean.valueOf(canBeVerbal);
	}
	public void setCanBeVerbal(String canBeVerbal) {
		this.canBeVerbal = canBeVerbal;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	 
	

}
