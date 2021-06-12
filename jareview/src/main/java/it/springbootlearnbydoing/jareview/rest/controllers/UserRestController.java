package it.springbootlearnbydoing.jareview.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.springbootlearnbydoing.jareview.entities.User;
import it.springbootlearnbydoing.jareview.services.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("findAll")
	public List<User> findAll() {
		return this.userService.findAll();
	}
}
