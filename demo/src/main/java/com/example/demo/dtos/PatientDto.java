package com.example.demo.dtos;

import lombok.Data;

@Data
public class PatientDto {
    private Long id;
    String fullName;
    Long diagnosysId;
    Long doctorId;
    String phoneNumber;
    String mail;
    String medicalHistory;
}
