package com.rt.service;

import java.util.List;
import java.util.Optional;

import com.rt.entity.MovieReview;

public interface ReviewService {
	
	public MovieReview addReview(MovieReview movieReview);
	public List<MovieReview> getAllReviews();
	public String deleteReview(Long id);
	public  Optional<MovieReview> getMovieById(Long id);
}
