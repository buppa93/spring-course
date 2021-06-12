package it.springbootlearnbydoing.jareview.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.springbootlearnbydoing.jareview.entities.Feedback;
import it.springbootlearnbydoing.jareview.repositories.FeedbackRepository;
import it.springbootlearnbydoing.jareview.services.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepo;

	@Override
	public List<Feedback> findAll() {
		return this.feedbackRepo.findAll();
	}

}
