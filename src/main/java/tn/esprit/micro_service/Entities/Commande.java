package tn.esprit.micro_service.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import java.util.Date;


@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_commande;
    private Long id_user;

    private Long id_service;

    @Enumerated(EnumType.STRING)

    private StatusCommande status_c;

    @Temporal(TemporalType.DATE)
    private Date dateCommande;

    private  Float price;

}
