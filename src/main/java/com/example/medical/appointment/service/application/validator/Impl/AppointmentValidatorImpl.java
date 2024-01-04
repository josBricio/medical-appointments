package com.example.medical.appointment.service.application.validator.Impl;

import com.example.medical.appointment.service.application.repository.ClinicsRepository;
import com.example.medical.appointment.service.application.repository.DoctorsRepository;
import com.example.medical.appointment.service.application.validator.AppointmentValidator;
import com.example.medical.appointment.service.common.exceptions.ExistingDateAppointmentException;
import com.example.medical.appointment.service.domain.entities.Appointment;
import com.example.medical.appointment.service.domain.entities.Clinic;
import com.example.medical.appointment.service.domain.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AppointmentValidatorImpl implements AppointmentValidator {
    @Autowired
    private ClinicsRepository clinicsRepository;

    @Autowired
    private DoctorsRepository doctorsRepository;

    @Override
    public void validateAppointment(Appointment appointment) {
        //validate there´s no appointment for that clinic and date already
        validateNoSameClinicAndDate(appointment);
        //validate there´s no appointment for that doctor and date already
        validateNoSameDoctorAndDate(appointment);
        //validate appointments interval time
        //validate doctor´s appointments limit per day


    }

    private void validateAppointmentsIntervalTime(Appointment appointment){

    }

    private void validateNoSameDoctorAndDate(Appointment appointment) {
        Doctor doctor = appointment.getDoctor();
        Optional<Doctor> optionalDoctor = Optional
                .ofNullable(doctorsRepository
                        .findByFirstNameAndLastNameAndSpecialty(
                                doctor.getFirstName(), doctor.getLastName(), doctor.getSpecialty()));

        boolean hasSameDateTime = false;
        if (optionalDoctor.isPresent()) {
            Doctor doctor1 = optionalDoctor.get();
            hasSameDateTime = doctor1.getAppointments().stream()
                    .anyMatch(ap -> ap.getDateTime().isEqual(appointment.getDateTime()));
        }
        if (hasSameDateTime) {
            throw new ExistingDateAppointmentException(ExistingDateAppointmentException.class.toString()
                    + ".  Please choose a different date.");
        }
    }


    private void validateNoSameClinicAndDate(Appointment appointment) {
        Optional<Clinic> optionalClinic = clinicsRepository
                .findById(appointment.getClinic().getClinicNumber());
        boolean hasSameDateTime = false;
        if (optionalClinic.isPresent()) {
            Clinic clinic = optionalClinic.get();
            hasSameDateTime = clinic.getAppointments().stream()
                    .anyMatch(ap -> ap.getDateTime().isEqual(appointment.getDateTime()));
        }
        if (hasSameDateTime) {
            throw new ExistingDateAppointmentException(ExistingDateAppointmentException.class.toString()
                    + ".  Please choose a different date.");
        }

    }
}
