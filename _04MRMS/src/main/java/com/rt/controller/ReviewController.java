package com.rt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.MovieReview;
import com.rt.service.ReviewImpl;

@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired 
	private ReviewImpl impl;
	
	@PostMapping("/")
	public ResponseEntity<MovieReview> reviews(@RequestBody MovieReview movieReview)
	{
		MovieReview review = impl.addReview(movieReview);
		
		return ResponseEntity.ok(review);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<MovieReview>> getAllMoviews(){
		
		List<MovieReview> allReviews = impl.getAllReviews();
		
		return ResponseEntity.ok(allReviews);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteReview(@PathVariable Long id){
		String mgs = impl.deleteReview(id);
		
		return ResponseEntity.ok(mgs);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<MovieReview>> getMovie(@PathVariable Long id){
		Optional<MovieReview> movieById = impl.getMovieById(id);
		return ResponseEntity.ok(movieById);
	}

}
