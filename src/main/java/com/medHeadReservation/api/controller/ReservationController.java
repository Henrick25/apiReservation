package com.medHeadReservation.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medHeadReservation.api.model.Reservation;
import com.medHeadReservation.api.service.HospitalService;
import com.medHeadReservation.api.service.ReservationService;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @Autowired
    private HospitalService HospitalService;

    @PostMapping("/api/web/reservation")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        HospitalService.decrementLit(reservation.getHospitalId());
        return ResponseEntity.ok(reservationService.saveReservation(reservation));
    }
      @GetMapping("/api/reservations/list")
    public ResponseEntity<List<Reservation>> getAllReservations() {
        List<Reservation> reservations = reservationService.getAllReservations();
        return ResponseEntity.ok(reservations);
    }
}
