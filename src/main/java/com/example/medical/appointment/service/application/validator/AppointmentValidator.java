package com.example.medical.appointment.service.application.validator;

import com.example.medical.appointment.service.domain.entities.Appointment;

public interface AppointmentValidator {

    void validateAppointment(Appointment appointment);
}
