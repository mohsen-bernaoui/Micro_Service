package tn.esprit.micro_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.micro_service.Entities.Subscription;

public interface SubscriptionRepo extends JpaRepository<Subscription,Long> {
}
