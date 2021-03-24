package com.register.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.springboot.model.User;
	@Repository
	public interface UserRepository extends JpaRepository<User,Integer> {
		User findByUserName(String userName);

	}

	
