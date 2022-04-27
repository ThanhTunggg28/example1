package net.sparkminds.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.entity.Category;
import net.sparkminds.user.repository.CategoryRepo;

@RestController
public class ApiCategory {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@GetMapping(value="/category")
	public List<Category> getCategory() {
		return categoryRepo.findAll();
	}
	
	
	@PostMapping(value="/add-category")
	public String addCategory(@RequestBody Category category) {
		categoryRepo.save(category);
		return "Saved...";
	}
	
	@PutMapping(value="update-category/{id}")
	public String updateCategory(@PathVariable long id, @RequestBody Category category) {
		Category updateCategory = categoryRepo.findById(id).get();
		updateCategory.setName(category.getName());
		updateCategory.setDescription(category.getDescription());
		updateCategory.setStatus(category.getStatus());
		categoryRepo.save(updateCategory);
		return "update...";
		
	}
	
	@DeleteMapping("/delete-category/{id}")
	public String deleteCategory(@PathVariable long id) {
		Category deleteCategory = categoryRepo.findById(id).get();
		categoryRepo.delete(deleteCategory);
		return "Delete id: " + id;
	}
	

}
