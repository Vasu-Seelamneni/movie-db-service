package com.msp.movie.db.service.impl;

import com.msp.movie.db.model.Review;
import com.msp.movie.db.repository.ReviewRepository;
import com.msp.movie.db.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review findById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

    @Override
    public void saveReview(Review review) {
        this.reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long reviewId) {
        this.reviewRepository.deleteById(reviewId);
    }
}
