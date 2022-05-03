package net.sparkminds.user.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.sparkminds.user.dto.CategoryRequestDto;
import net.sparkminds.user.entity.Category;
import net.sparkminds.user.repository.CategoryRepository;
import net.sparkminds.user.service.CategoryService;

@Service
@Transactional(readOnly = true)
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	@Transactional
	public Category createCategory(CategoryRequestDto categoryRequestDto) {
		Category category = new Category();
		category.setName(categoryRequestDto.getName());
		category.setDescription(categoryRequestDto.getDescription());
		category.setStatus(categoryRequestDto.getStatus());
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@Override
	@Transactional
	public void updateCategory(CategoryRequestDto categoryRequestDto, Long id) {
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Category is not exist"));

		category.setName(categoryRequestDto.getName());
		category.setDescription(categoryRequestDto.getDescription());
		category.setStatus(categoryRequestDto.getStatus());

	}
	@Override
	@Transactional
	public void deleteCategory(Long id) {
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Category is not exist"));

		categoryRepository.delete(category);
	}
}
