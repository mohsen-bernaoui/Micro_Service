package tn.esprit.micro_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.micro_service.Entities.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {
}
