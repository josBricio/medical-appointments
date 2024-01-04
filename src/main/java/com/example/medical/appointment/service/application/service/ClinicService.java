package com.example.medical.appointment.service.application.service;

import com.example.medical.appointment.service.domain.entities.Clinic;

public interface ClinicService {

    Clinic createClinic(Clinic clinic);

    Clinic getClinic(Clinic clinic);
}
