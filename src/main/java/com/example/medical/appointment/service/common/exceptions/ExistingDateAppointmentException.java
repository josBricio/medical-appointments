package com.example.medical.appointment.service.common.exceptions;

public class ExistingDateAppointmentException extends RuntimeException{
    public ExistingDateAppointmentException(String message){super(message);}
}
