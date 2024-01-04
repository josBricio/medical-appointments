package com.example.medical.appointment.service.common.exceptions;

public class NotEnoughTimeForAppointmentException extends RuntimeException{
    public NotEnoughTimeForAppointmentException(String message){super(message);}
}
