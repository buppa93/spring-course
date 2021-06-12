package it.springbootlearnbydoing.jareview.services;

import java.util.List;

import it.springbootlearnbydoing.jareview.entities.User;

public interface UserService {
	List<User> findAll();
}
