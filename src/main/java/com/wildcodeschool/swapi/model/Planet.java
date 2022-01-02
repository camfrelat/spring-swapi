package com.wildcodeschool.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {

	private String name;
    @JsonProperty("rotation_period")
    private Long rotationPeriod;
    @JsonProperty("orbital_period")
    private Long orbitalPeriod;
    private Long diameter;
    private String climate;
    private String gravity;
    private String terrain;
    @JsonProperty("surface_water")
    private Integer surfaceWater;
    private Long population;
    private String[] residents;
    private String[] films;
    private String created;
    private String edited;
    private String url;

    //  empty constructor
    
    public Planet () {
    	
    }
    
    // Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(Long rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public Long getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(Long orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public Long getDiameter() {
		return diameter;
	}

	public void setDiameter(Long diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public Integer getSurfaceWater() {
		return surfaceWater;
	}

	public void setSurfaceWater(Integer surfaceWater) {
		this.surfaceWater = surfaceWater;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String[] getResidents() {
		return residents;
	}

	public void setResidents(String[] residents) {
		this.residents = residents;
	}

	public String[] getFilms() {
		return films;
	}

	public void setFilms(String[] films) {
		this.films = films;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

    
    

}
