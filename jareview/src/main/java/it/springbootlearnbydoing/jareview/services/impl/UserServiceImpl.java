package it.springbootlearnbydoing.jareview.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.springbootlearnbydoing.jareview.entities.User;
import it.springbootlearnbydoing.jareview.repositories.UserRepository;
import it.springbootlearnbydoing.jareview.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> findAll() {
		return this.userRepo.findAll();
	}

}
