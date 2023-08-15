package com.kodeshproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodeshproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
