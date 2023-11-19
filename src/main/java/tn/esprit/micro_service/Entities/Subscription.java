package tn.esprit.micro_service.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_sub;
    @Enumerated(EnumType.STRING)
    private TypeSubscription type_sub;
    @Temporal(TemporalType.DATE)
    private Date dateExp_sub;
    @OneToOne(mappedBy = "subsription")
    private User user;
}
