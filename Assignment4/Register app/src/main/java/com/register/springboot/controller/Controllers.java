package com.register.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.register.springboot.model.User;
import com.register.springboot.repository.UserRepository;
import com.register.springboot.service.Userservice;

@Controller
public class Controllers {
	@Autowired
	UserRepository userrepo;
	@Autowired
	Userservice userservice;

	@GetMapping("/")
	public String Home() {
		return "Home";
	}

	@GetMapping("User")
	public String User() {
		return "User";
	}

	@GetMapping("admin")
	public String Admin() {
		return "admin";
	}

	@GetMapping("register")
	public String showsignUpForm(User user) {
		return "register";
	}

	@GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("Users", userrepo.findAll());
		return "index";
	}

	@PostMapping("add")
	public String addUser(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "register";
		} else if (userservice.isUserAlreadyPresent(user)) {
			model.addAttribute("message", "user already Exists");
		} else if (userservice.Age(user)) {
			model.addAttribute("message", "user registered succesfully");
		} else {
			model.addAttribute("message", "age should be greater than 18");
		}
		return "register";

	}

	@PostMapping("update/{id}")
	public String updateUser(@PathVariable("id") int id, @Valid User user, BindingResult result, Model model) {
		String page = "";
		if (result.hasErrors()) {
			page = "update-user";
		} else if (!userservice.Age(user)) {
			model.addAttribute("message", "age should be greater than 18");
			page = "update-user";
		} else {
			model.addAttribute("message", "user updated succesfully");
			model.addAttribute("Users", userrepo.findAll());
			page = "index";
		}
		return page;
	}

	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
		User user = userrepo.findById(id).orElseThrow();
		model.addAttribute("user", user);
		return "update-user";
	}

	@GetMapping("delete/{id}")
	public String deleteUser(@PathVariable("id") int id, Model model) {
		User user = userrepo.findById(id).orElseThrow();
		userrepo.delete(user);
		model.addAttribute("Users", userrepo.findAll());
		return "index";
	}

}
