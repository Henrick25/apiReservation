package com.medHeadReservation.api.mapper;

import com.medHeadReservation.api.dto.ReservationDTO;
import com.medHeadReservation.api.model.Reservation;

public class ReservationMapper {
    public static ReservationDTO toDTO(Reservation reservation) {
        ReservationDTO dto = new ReservationDTO();
        // Mapper tous les champs nécessaires
        dto.setId(reservation.getId());
        // Répétez pour les autres champs
       dto.setEtat_demande(reservation.getEtat_demande());
        return dto;
    }

    public static Reservation toEntity(ReservationDTO dto) {
        Reservation reservation = new Reservation();
        // Mapper tous les champs nécessaires
        reservation.setId(dto.getId()); // Note: Généralement non nécessaire pour une création
        // Répétez pour les autres champs
       reservation.setEtat_demande(dto.getEtat_demande());
        return reservation;
    }
}
