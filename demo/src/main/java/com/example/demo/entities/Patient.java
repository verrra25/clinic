package com.example.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String fullName;
    Long diagnosysId;
    Long doctorId;
    String phoneNumber;
    String mail;
    String medicalHistory;
}
