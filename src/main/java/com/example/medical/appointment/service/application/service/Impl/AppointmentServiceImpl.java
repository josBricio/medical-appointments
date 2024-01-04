package com.example.medical.appointment.service.application.service.Impl;

import com.example.medical.appointment.service.application.repository.AppointmentsRepository;
import com.example.medical.appointment.service.application.service.AppointmentService;
import com.example.medical.appointment.service.application.validator.AppointmentValidator;
import com.example.medical.appointment.service.domain.entities.Appointment;
import com.example.medical.appointment.service.domain.entities.Clinic;
import com.example.medical.appointment.service.domain.entities.Doctor;
import com.example.medical.appointment.service.domain.entities.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentsRepository appointmentsRepository;

    @Autowired
    private AppointmentValidator appointmentValidator;

    @Override
    public Appointment createAppointment(Appointment appointment) {
        appointmentValidator.validateAppointment(appointment);
        return appointmentsRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAppointmentsByDoctor(Doctor doctor) {
        return appointmentsRepository.findByDoctor(doctor);
    }

    @Override
    public List<Appointment> getAppointmentsByClinic(Clinic clinic) {
        return appointmentsRepository.findByClinic(clinic);
    }

    @Override
    public List<Appointment> getAppointmentsByPacient(Pacient pacient) {
        return appointmentsRepository.findByPacient(pacient);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        appointmentValidator.validateAppointment(appointment);
        return appointmentsRepository.save(appointment);
    }
}
