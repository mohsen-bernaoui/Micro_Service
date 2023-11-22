package tn.esprit.micro_service.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.Service;
import org.apache.catalina.User;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReview;
    //private User reviewer;
    //private Service service;
    private int rating;
    private String comment;
    @Temporal(TemporalType.DATE)
    private Date reviewDate;
}
