package com.example.demo.services;

import com.example.demo.dtos.PatientDto;
import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = new Patient();
        patient.setId(patientDto.getId());
        patient.setFullName(patientDto.getFullName());
        patient.setDiagnosysId(patientDto.getDiagnosysId());
        patient.setDoctorId(patientDto.getDoctorId());
        patient.setPhoneNumber(patientDto.getPhoneNumber());
        patient.setMail(patientDto.getMail());
        patient.setMedicalHistory(patientDto.getMedicalHistory());

        Patient saved = patientRepository.save(patient);
        return toDto(saved);
    }

    public PatientDto getPatientById(Long patientId) {
        return patientRepository.findById(patientId)
                .map(this::toDto)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with id: " + patientId));
    }

    private PatientDto toDto(Patient patient) {
        PatientDto dto = new PatientDto();
        dto.setId(patient.getId());
        dto.setFullName(patient.getFullName());
        dto.setDiagnosysId(patient.getDiagnosysId());
        dto.setDoctorId(patient.getDoctorId());
        dto.setPhoneNumber(patient.getPhoneNumber());
        dto.setMail(patient.getMail());
        dto.setMedicalHistory(patient.getMedicalHistory());
        return dto;
    }
}
