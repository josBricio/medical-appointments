package com.example.medical.appointment.service.application.repository;

import com.example.medical.appointment.service.domain.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorsRepository extends JpaRepository<Doctor,Long> {

    Doctor findByFirstNameAndLastNameAndSpecialty(String firstName, String lastName, String specialty);
}
