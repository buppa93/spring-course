package it.springbootlearnbydoing.jareview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.springbootlearnbydoing.jareview.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
