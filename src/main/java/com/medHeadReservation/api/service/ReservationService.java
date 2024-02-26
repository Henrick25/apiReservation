package com.medHeadReservation.api.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medHeadReservation.api.model.Reservation;
import com.medHeadReservation.api.repository.ReservationRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
    public List <Reservation> getAllReservations (){
        return reservationRepository.findAll();
    }
    public Reservation updateEtatDemande(Long id, Boolean nouvelEtat) {
    Reservation reservation = reservationRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Reservation non trouvée avec l'id: " + id));
    reservation.setEtat_demande(nouvelEtat);
    return reservationRepository.save(reservation);
}
}
