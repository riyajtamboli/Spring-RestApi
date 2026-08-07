package com.rt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.MovieReview;
import com.rt.repository.ReviewRepository;

@Service
public class ReviewImpl implements ReviewService{

	@Autowired
	private ReviewRepository repository;
	
	@Override
	public MovieReview addReview(MovieReview movieReview) {
	
		return repository.save(movieReview);
	}

	@Override
	public List<MovieReview> getAllReviews() {
		return repository.findAll();
	}

	@Override
	public String deleteReview(Long id) {
		 repository.deleteById(id);
		return "Movie Review deleted " +id;
	}

	@Override
	public Optional<MovieReview> getMovieById(Long id) {
		Optional<MovieReview> movie = repository.findById(id);
		return movie;
	}

}
