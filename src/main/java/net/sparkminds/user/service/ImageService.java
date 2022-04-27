package net.sparkminds.user.service;

import org.springframework.stereotype.Service;

import net.sparkminds.user.dto.ImageRequestDto;
import net.sparkminds.user.entity.Image;

@Service
public class ImageService {

	public static ImageRequestDto showInfor(Image image) {

		ImageRequestDto imageRequsetDto = new ImageRequestDto();
		imageRequsetDto.setCategory(image.getCategory());
		imageRequsetDto.setTitle(image.getTitle());
		imageRequsetDto.setDescription(image.getDescription());
		imageRequsetDto.setUrlImage(image.getUrlImage());

		return imageRequsetDto;

	}
}
