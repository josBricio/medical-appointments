package com.example.medical.appointment.service.application.service;

import com.example.medical.appointment.service.application.DTOs.DoctorDTO;
import com.example.medical.appointment.service.application.repository.DoctorsRepository;
import com.example.medical.appointment.service.domain.entities.Doctor;

public interface DoctorService {

    Doctor createDoctor(Doctor doctor);

    Doctor getDoctor(Doctor doctor);
}
