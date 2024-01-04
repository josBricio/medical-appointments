package com.example.medical.appointment.service.application.service.Impl;

import com.example.medical.appointment.service.application.repository.ClinicsRepository;
import com.example.medical.appointment.service.application.service.ClinicService;
import com.example.medical.appointment.service.domain.entities.Clinic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    private ClinicsRepository clinicsRepository;
    @Override
    public Clinic createClinic(Clinic clinic) {
        return clinicsRepository.save(clinic);
    }

    @Override
    public Clinic getClinic(Clinic clinic) {

        Optional<Clinic> optionalClinic = clinicsRepository.findById(clinic.getClinicNumber());
        if(optionalClinic.isPresent()){
            return optionalClinic.get();
        }else{
            throw new NullPointerException("Clinic was not found with that information");
        }


    }
}
