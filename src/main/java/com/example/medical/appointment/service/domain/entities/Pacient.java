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
@Table(name = "pacients")
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pacientID;

    private String name;
    @OneToMany(mappedBy = "pacient")
    private List<Appointment> appointments;
}
