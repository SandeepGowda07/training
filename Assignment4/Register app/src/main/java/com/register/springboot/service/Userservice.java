package com.register.springboot.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.register.springboot.model.User;
import com.register.springboot.repository.UserRepository;

@Service
public class Userservice {
	@Autowired
	UserRepository userrepo;
	@Autowired
	BCryptPasswordEncoder encoder;

	public boolean isUserAlreadyPresent(User user) {
		boolean isUserAlreadyExists = false;
		User existinguser = userrepo.findByUserName(user.getUserName());
		if (existinguser != null) {
			isUserAlreadyExists = true;
		}
		return isUserAlreadyExists;
	}

	public boolean Age(User user) {
		boolean status = false;
		String dob = user.getDob();
		LocalDate birthdate = LocalDate.parse(dob);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(birthdate, now);
		int age = diff.getYears();
		if (age > 18) {
			user.setAge(age);
			user.setRoles("ROLE_USER");
			user.setPassword(encoder.encode(user.getPassword()));
			userrepo.save(user);
			status = true;
		}
		return status;
	}

}
