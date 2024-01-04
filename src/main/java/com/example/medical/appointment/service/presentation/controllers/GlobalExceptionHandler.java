package com.example.medical.appointment.service.presentation.controllers;

import com.example.medical.appointment.service.common.exceptions.AppointmentsLimintPerDayException;
import com.example.medical.appointment.service.common.exceptions.ExistingDateAppointmentException;
import com.example.medical.appointment.service.common.exceptions.NotEnoughTimeForAppointmentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AppointmentsLimintPerDayException.class)
    public ResponseEntity<String> handleAppointmentsLimitPerDayException(AppointmentsLimintPerDayException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(ExistingDateAppointmentException.class)
    public ResponseEntity<String> handleExistingDateAppointmentException(ExistingDateAppointmentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(NotEnoughTimeForAppointmentException.class)
    public ResponseEntity<String> handleNotEnoughTimeForAppointmentException(NotEnoughTimeForAppointmentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
