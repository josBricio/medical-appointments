package com.example.medical.appointment.service.application.repository;

import com.example.medical.appointment.service.domain.entities.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientRepository extends JpaRepository<Pacient,Long> {

    Pacient findByName(String name);
}
