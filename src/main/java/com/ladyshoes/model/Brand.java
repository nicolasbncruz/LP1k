package com.ladyshoes.model;

public class Brand {
	private int id;
	private String name;
	private String description;
	private String state;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Brand(int id, String name, String description, String state) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.state = state;
	}
	public Brand() {
		super();
	}
	
	

}
