package tn.esprit.micro_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.micro_service.Entities.Commande;

public interface CommandeRepo extends JpaRepository<Commande,Long> {
}
