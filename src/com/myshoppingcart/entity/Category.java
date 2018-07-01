package com.myshoppingcart.entity;

public class Category {

	/*
	 * Defining the private fields for CATOGORY
	 * */
	private int id;
	private String name;
	private String description;
	private String imgURL;
	private Boolean isActive = true;
	
	
	/*
	 * Defining the Setters and Getters for the private fields in CATOGORY
	 * */
	
	
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
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	/*
	 * Defining the toString method for CATOGORY
	 * */
	
	@Override
	public String toString() {
		return "Catogory [id=" + id + ", name=" + name + ", description=" + description + ", imgURL=" + imgURL
				+ ", isActive=" + isActive + "]";
	}
	
}
