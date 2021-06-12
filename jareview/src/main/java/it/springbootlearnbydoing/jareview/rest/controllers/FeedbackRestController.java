package it.springbootlearnbydoing.jareview.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.springbootlearnbydoing.jareview.entities.Feedback;
import it.springbootlearnbydoing.jareview.services.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackRestController {

	@Autowired
	private FeedbackService feedbackService;
	
	@GetMapping("findAll")
	public List<Feedback> findAll() {
		return this.feedbackService.findAll();
	}
}
