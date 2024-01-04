package com.example.medical.appointment.service.application.repository;

import com.example.medical.appointment.service.domain.entities.Appointment;
import com.example.medical.appointment.service.domain.entities.Clinic;
import com.example.medical.appointment.service.domain.entities.Doctor;
import com.example.medical.appointment.service.domain.entities.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentsRepository extends JpaRepository<Appointment,Long> {

    List<Appointment> findByDoctor(Doctor doctor);
    List<Appointment> findByClinic(Clinic clinic);
    List<Appointment> findByPacient(Pacient pacient);
}
