package tn.esprit.micro_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.micro_service.Entities.ServiceE;

public interface ServiceRepo extends JpaRepository<ServiceE,Long> {
}
