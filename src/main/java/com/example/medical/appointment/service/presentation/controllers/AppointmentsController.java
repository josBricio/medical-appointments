package com.example.medical.appointment.service.presentation.controllers;

import com.example.medical.appointment.service.application.service.AppointmentService;
import com.example.medical.appointment.service.domain.entities.Appointment;
import com.example.medical.appointment.service.domain.entities.Clinic;
import com.example.medical.appointment.service.domain.entities.Doctor;
import com.example.medical.appointment.service.domain.entities.Pacient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/appointments")
public class AppointmentsController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/create")
    public ResponseEntity<Appointment> createAppointment(Appointment appointment){

        return ResponseEntity.status(HttpStatus.OK).body(appointmentService.createAppointment(appointment));
    }

    @GetMapping("/get-by-clinic")
    public ResponseEntity<List<Appointment>> getAppointmentByClinic(Clinic clinic){
        List<Appointment> appointmentList = appointmentService.getAppointmentsByClinic(clinic);
        return ResponseEntity.status(HttpStatus.OK).body(appointmentList);
    }

    @GetMapping("/get-by-doctor")
    public ResponseEntity<List<Appointment>> getAppointmentByDoctor(Doctor doctor){
        List<Appointment> appointmentList = appointmentService.getAppointmentsByDoctor(doctor);
        return ResponseEntity.status(HttpStatus.OK).body(appointmentList);
    }
    @GetMapping("/get-by-pacient")
    public ResponseEntity<List<Appointment>> getAppointmentByPacient(Pacient pacient){
        List<Appointment> appointmentList = appointmentService.getAppointmentsByPacient(pacient);
        return ResponseEntity.status(HttpStatus.OK).body(appointmentList);
    }
}
