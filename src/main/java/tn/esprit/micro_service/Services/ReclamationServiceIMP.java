package tn.esprit.micro_service.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.micro_service.Entities.Reclamation;
import tn.esprit.micro_service.Repository.ReclamationRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class ReclamationServiceIMP implements IReclamation{
    private ReclamationRepo reclamationRepo;
    @Override
    public Reclamation createReclamation(Reclamation reclamation) {
        return reclamationRepo.save(reclamation);
    }

    @Override
    public Reclamation getReclamationById(Long idr) {
        return reclamationRepo.findById(idr).orElse(null);
    }

    @Override
    public List<Reclamation> getAllReclamation() {
        return reclamationRepo.findAll();
    }

    @Override
    public Reclamation updateReclamation(Reclamation reclamation) {
        return reclamationRepo.save(reclamation);
    }

    @Override
    public void deleteReclamation(Long idr) {
        reclamationRepo.deleteById(idr);

    }
}
