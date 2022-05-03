package net.sparkminds.user.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.sparkminds.user.dto.ImageRequestDto;
import net.sparkminds.user.entity.Image;
import net.sparkminds.user.repository.ImageRepository;
import net.sparkminds.user.service.ImageService;


@Service
@Transactional(readOnly = true)
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageRepository imageRepository;
	
	@Override
	@Transactional
	public Image createImage(ImageRequestDto imageRequestDto) {
		Image image = new Image();
		image.setCategory(imageRequestDto.getCategory());
		image.setTitle(imageRequestDto.getTitle());
		image.setDescription(imageRequestDto.getDescription());
		image.setUrlImage(imageRequestDto.getUrlImage());
		return imageRepository.save(image);
		
		
	}
	
	
	
	@Override
	public List<Image> getAllImage(){
		return imageRepository.findAll();
	}
	
	
	
	@Override
	@Transactional
	public void updateImage(ImageRequestDto imageRequestDto, Long id) {
		Image image = imageRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Image is not exist"));
		
		image.setCategory(imageRequestDto.getCategory());
		image.setTitle(imageRequestDto.getTitle());
		image.setDescription(imageRequestDto.getDescription());
		image.setUrlImage(imageRequestDto.getUrlImage());
	}
	
	
	
	
	@Override
	@Transactional
	public void deleteImage(Long id) {
		Image image = imageRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Image is not exist"));
		imageRepository.delete(image);
	}

}
