package tn.esprit.micro_service.Restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro_service.Entities.Reclamation;
import tn.esprit.micro_service.Services.ReclamationServiceIMP;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/reclamations")
public class ReclamationController {

private ReclamationServiceIMP reclamationServiceIMP;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation) {
        return new ResponseEntity<>(reclamationServiceIMP.createReclamation(reclamation), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Reclamation> updateReclamation(@PathVariable Long id, @RequestBody Reclamation reclamation) {
        return new ResponseEntity<>(reclamationServiceIMP.updateReclamation(id,reclamation), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteReclamation(@PathVariable Long id) {
        reclamationServiceIMP.deleteReclamation(id);
        return new ResponseEntity<>("Reclamation with ID " + id + " deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/getAllReclamations")
    public List<Reclamation> getAllReclamation() {
        return reclamationServiceIMP.getAllReclamation();
    }

    @GetMapping("/getReclamationById/{id}")
    public Reclamation getReclamationById(@PathVariable Long id) {
        return reclamationServiceIMP.getReclamationById(id);
    }
}