package com.example.medical.appointment.service.domain.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "clinics")
public class Clinic {
    @Id
    private Integer clinicNumber;
    private Integer floor;

    @OneToMany(mappedBy = "clinic")
    private List<Appointment> appointments;
}
