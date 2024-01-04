package com.example.medical.appointment.service.application.service;

import com.example.medical.appointment.service.domain.entities.Appointment;
import com.example.medical.appointment.service.domain.entities.Clinic;
import com.example.medical.appointment.service.domain.entities.Doctor;
import com.example.medical.appointment.service.domain.entities.Pacient;

import java.util.List;

public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> getAppointmentsByDoctor(Doctor doctor);
    List<Appointment> getAppointmentsByClinic(Clinic clinic);
    List<Appointment> getAppointmentsByPacient(Pacient pacient);


    Appointment updateAppointment(Appointment appointment);

}
