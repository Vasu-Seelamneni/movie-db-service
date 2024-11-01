package com.msp.movie.db.controller;

import com.msp.movie.db.model.Review;
import com.msp.movie.db.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/all")
    public List<Review> getAllReviews() {
        return reviewService.findAll();
    }

    @GetMapping("/find/{id}")
    public Review getReviewById(@PathVariable Long id) {
        return reviewService.findById(1L);
    }

    @PostMapping("/save")
    public void saveReview(@RequestBody Review review) {
        reviewService.saveReview(review);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }


}
