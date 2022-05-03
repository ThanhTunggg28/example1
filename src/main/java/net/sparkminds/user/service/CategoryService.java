package net.sparkminds.user.service;

import java.util.List;

import net.sparkminds.user.dto.CategoryRequestDto;
import net.sparkminds.user.entity.Category;

public interface CategoryService {
	Category createCategory(CategoryRequestDto categoryRequestDto);
	
	List<Category> getAllCategory();

	void updateCategory(CategoryRequestDto categoryRequestDto, Long id);

	void deleteCategory(Long id);
}

