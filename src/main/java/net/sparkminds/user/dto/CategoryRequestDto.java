package net.sparkminds.user.dto;

import net.sparkminds.user.entity.enumeration.CategoryStatus;

public class CategoryRequestDto {
	
	private String name;
	
	
	private String description;
	
	
	private CategoryStatus status;


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


	public CategoryStatus getStatus() {
		return status;
	}


	public void setStatus(CategoryStatus status) {
		this.status = status;
	}
	
}
