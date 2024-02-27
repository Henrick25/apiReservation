package com.medHeadReservation.api.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medHeadReservation.api.dto.ReservationDTO;
import com.medHeadReservation.api.mapper.ReservationMapper;
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
   
     public List<ReservationDTO> getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        
        List<ReservationDTO> reservationDTOs = reservations.stream()
                                                            .map(ReservationMapper::toDTO)
                                                            .collect(Collectors.toList());
        
        return reservationDTOs;
    }
    public Reservation updateEtatDemande(Long id, Boolean nouvelEtat) {
    Reservation reservation = reservationRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Reservation non trouvée avec l'id: " + id));
    reservation.setEtat_demande(nouvelEtat);
    return reservationRepository.save(reservation);
}
}
