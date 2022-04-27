package net.sparkminds.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.entity.Image;
import net.sparkminds.user.repository.ImageRepository;

@RestController
public class ImageController {

	@Autowired
	private ImageRepository imageRepository;
	
	@GetMapping(value="/image")
	public List<Image> getCategory() {
		return imageRepository.findAll();
	}
	
	@PostMapping(value="/add-image")
	public String addImage(@RequestBody Image image) {
		imageRepository.save(image);
		return "Saved...";
	}
	
	
}
