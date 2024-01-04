package com.example.medical.appointment.service.presentation.controllers;

import com.example.medical.appointment.service.application.service.DoctorService;
import com.example.medical.appointment.service.domain.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/doctors")
public class DoctorsController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/create-doctor")
    public ResponseEntity<Doctor> createDoctor(Doctor doctor){
        doctorService.createDoctor(doctor);
         return ResponseEntity.status(HttpStatus.OK).body(doctor);
    }

}
