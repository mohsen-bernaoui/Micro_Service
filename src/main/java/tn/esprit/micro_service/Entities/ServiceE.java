package tn.esprit.micro_service.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class ServiceE  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idService;
    private String title;
    private String description;
    private  double tarif;
    private int dure;
    private String image;

    public ServiceE() {

    }
}
