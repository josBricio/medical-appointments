package com.example.medical.appointment.service.application.repository;

import com.example.medical.appointment.service.domain.entities.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicsRepository extends JpaRepository<Clinic,Integer> {


}
