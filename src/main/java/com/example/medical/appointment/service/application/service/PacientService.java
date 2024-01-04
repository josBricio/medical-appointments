package com.example.medical.appointment.service.application.service;

import com.example.medical.appointment.service.domain.entities.Appointment;
import com.example.medical.appointment.service.domain.entities.Pacient;

import java.util.List;

public interface PacientService {

    Pacient createPacient(Pacient pacient);

    Pacient getPacient(Pacient pacient);

}
