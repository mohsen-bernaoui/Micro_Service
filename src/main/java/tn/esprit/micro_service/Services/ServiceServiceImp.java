package tn.esprit.micro_service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.micro_service.Entities.ServiceE;
import tn.esprit.micro_service.Repository.ServiceRepo;

import java.util.List;
@Service
public class ServiceServiceImp {
    @Autowired
    private ServiceRepo serviceRepository;
    public ServiceE addService(ServiceE S){
        return serviceRepository.save(S);
    }

    public ServiceE updateService(long idService, ServiceE newCandidat) {

        if (serviceRepository.findById(idService).isPresent()) {
            ServiceE existingCandidat = serviceRepository.findById(idService).get();
            existingCandidat.setTitle(newCandidat.getTitle());
            existingCandidat.setDescription(newCandidat.getDescription());
            existingCandidat.setTarif(newCandidat.getTarif());
            existingCandidat.setDure(newCandidat.getDure());
            existingCandidat.setImage(newCandidat.getImage());
            return serviceRepository.save(existingCandidat);
        } else
            return null;
    }
    public String deleteService(long idService) {
        if (serviceRepository.findById(idService).isPresent()) {
            serviceRepository.deleteById(idService);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }
    public List<ServiceE> getAllServices(){
        return serviceRepository.findAll();
    }

    public ServiceE getServiceById(Long idService) {
        return serviceRepository.findById(idService).orElse(null);
    }
}
