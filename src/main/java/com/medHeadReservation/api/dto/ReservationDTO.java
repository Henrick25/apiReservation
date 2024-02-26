package com.medHeadReservation.api.dto;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationDTO {
    private Long id;
    private Long hospitalId;
    private String patientName;
    private String patientPhone;
    private String mail;
    private Integer age;
    private String sexe;
    private String heure;
    private String etat;
    private Boolean etatDemande;

    // Constructors, Getters and Setters
}
