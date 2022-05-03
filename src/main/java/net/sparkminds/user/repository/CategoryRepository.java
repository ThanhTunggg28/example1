package net.sparkminds.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sparkminds.user.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long > {

}
