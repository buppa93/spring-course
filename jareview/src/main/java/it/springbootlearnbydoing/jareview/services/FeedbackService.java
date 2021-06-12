package it.springbootlearnbydoing.jareview.services;

import java.util.List;

import it.springbootlearnbydoing.jareview.entities.Feedback;

public interface FeedbackService {

	List<Feedback> findAll();
}
