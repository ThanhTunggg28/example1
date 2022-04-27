package net.sparkminds.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sparkminds.user.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long > {

}
