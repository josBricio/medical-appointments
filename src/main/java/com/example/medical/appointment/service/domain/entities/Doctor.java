package com.example.medical.appointment.service.domain.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long doctorID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String specialty;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment>appointments;
}
