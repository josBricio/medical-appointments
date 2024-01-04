package com.example.medical.appointment.service.application.service.Impl;

import com.example.medical.appointment.service.application.repository.DoctorsRepository;
import com.example.medical.appointment.service.application.service.DoctorService;
import com.example.medical.appointment.service.domain.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorsRepository doctorsRepository;

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorsRepository.save(doctor);
    }

    @Override
    public Doctor getDoctor(Doctor doctor) {
        return doctorsRepository
                .findByFirstNameAndLastNameAndSpecialty(
                        doctor.getFirstName(), doctor.getLastName(), doctor.getSpecialty());
    }
}
