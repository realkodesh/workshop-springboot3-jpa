package com.kodeshproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodeshproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
