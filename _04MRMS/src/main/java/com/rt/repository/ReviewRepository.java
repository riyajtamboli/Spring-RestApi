package com.rt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rt.entity.MovieReview;

@Repository
public interface ReviewRepository extends JpaRepository<MovieReview,Long> {

}
