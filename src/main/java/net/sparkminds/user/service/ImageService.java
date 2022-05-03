package net.sparkminds.user.service;

import java.util.List;

import net.sparkminds.user.dto.ImageRequestDto;
import net.sparkminds.user.entity.Image;

public interface ImageService {
	
	Image createImage(ImageRequestDto imageRequestDto);
	
	List<Image> getAllImage();
	
	void updateImage(ImageRequestDto imageRequestDto, Long id);
	
	void deleteImage(Long id);

}
