package tn.esprit.micro_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.micro_service.Entities.Category;
import tn.esprit.micro_service.Entities.Reclamation;

public interface ReclamationRepo extends JpaRepository<Reclamation,Long> {
}
