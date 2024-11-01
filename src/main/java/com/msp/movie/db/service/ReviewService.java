package com.msp.movie.db.service;

import com.msp.movie.db.model.Review;

import java.util.List;

public interface ReviewService {

    List<Review> findAll();

    Review findById(Long reviewId);

    void saveReview(Review review);

    void deleteReview(Long reviewId);
}
