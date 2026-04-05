package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    Long id;
    String fullName;
    String cabinet;
    String specialization;
    Long price;
    String phoneNumber;
}
