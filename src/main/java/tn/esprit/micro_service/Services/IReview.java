package tn.esprit.micro_service.Services;
import tn.esprit.micro_service.Entities.Review;

import java.util.List;

public interface IReview {
    Review addReview(Review review);
    Review getReviewById(Long idReview);
    List<Review> getAllReviews();
    Review updateReview(Long idReview, Review updatedReview);
    void deleteReview(Long idReview);


}
