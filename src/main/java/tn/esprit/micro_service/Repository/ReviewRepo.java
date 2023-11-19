package tn.esprit.micro_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.micro_service.Entities.Review;

public interface ReviewRepo extends JpaRepository<Review,Long> {
}
