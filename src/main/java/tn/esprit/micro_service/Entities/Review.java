package tn.esprit.micro_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.apache.catalina.Service;
import org.apache.catalina.User;

import java.util.Date;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User reviewer;
    private Service service;
    private int rating;
    private String comment;
    private Date reviewDate;
}
