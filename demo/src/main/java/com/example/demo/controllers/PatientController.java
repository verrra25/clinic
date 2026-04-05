package com.example.demo.controllers;


import com.example.demo.dtos.PatientDto;
import com.example.demo.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping("/new-patient")
    public void createPatient(PatientDto newPatient) {
        patientService.createPatient(newPatient);
    }

    @GetMapping("/search")
    public PatientDto searchPatient(Long patientId) {
        return patientService.getPatientById(patientId);
    }
}
