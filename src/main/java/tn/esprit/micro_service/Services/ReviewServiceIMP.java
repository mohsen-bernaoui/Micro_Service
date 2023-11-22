package tn.esprit.micro_service.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.micro_service.Entities.Review;
import tn.esprit.micro_service.Repository.ReviewRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServiceIMP implements IReview {
    private ReviewRepo reviewRepo;
    @Override
    public Review addReview(Review review) {
        return reviewRepo.save(review);
    }

    @Override
    public Review getReviewById(Long idReview) {
        return reviewRepo.findById(idReview).orElse(null);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    @Override
    public Review updateReview(Long idReview, Review updatedReview) {
        return reviewRepo.save(updatedReview);
    }

    @Override
    public void deleteReview(Long idReview) {
        reviewRepo.deleteById(idReview);

    }
}
