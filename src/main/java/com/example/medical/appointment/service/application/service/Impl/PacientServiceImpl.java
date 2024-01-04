package com.example.medical.appointment.service.application.service.Impl;

import com.example.medical.appointment.service.application.repository.PacientRepository;
import com.example.medical.appointment.service.application.service.PacientService;
import com.example.medical.appointment.service.domain.entities.Appointment;
import com.example.medical.appointment.service.domain.entities.Pacient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PacientServiceImpl implements PacientService {

    @Autowired
    private PacientRepository pacientRepository;

    @Override
    public Pacient createPacient(Pacient pacient) {
        return pacientRepository.save(pacient);
    }

    @Override
    public Pacient getPacient(Pacient pacient) {
        return pacientRepository.findByName(pacient.getName());
    }

}
