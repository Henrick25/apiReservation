package com.medHeadReservation.api.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter
@Setter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "hospital_id")
    private Long hospitalId;

    @Column(name = "patient_name", nullable = false, length = 255)
    private String patientName;

    @Column(name = "patient_phone", nullable = false, length = 20)
    private String patientPhone;

    @Column(nullable = false, length = 255)
    private String mail;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false, length = 10)
    private String sexe;

    @Column(nullable = false, length = 5)
    private String heure;

    @Column(nullable = false, length = 255)
    private String etat;
}