package tn.esprit.micro_service.Services;


import tn.esprit.micro_service.Entities.Reclamation;

import java.util.List;

public interface IReclamation {
    Reclamation createReclamation(Reclamation reclamation);
    Reclamation getReclamationById(Long idr);
    List<Reclamation> getAllReclamation();
    public Reclamation updateReclamation(Long idR,Reclamation reclamation);
    public  void deleteReclamation(Long idr);

}
