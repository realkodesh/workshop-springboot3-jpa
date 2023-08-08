package com.kodeshproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodeshproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
