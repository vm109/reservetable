package com.gpreservation.reservetable.controller;

import com.gpreservation.reservetable.models.Reservation;
import com.gpreservation.reservetable.services.CreateReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupReservation {
    @Autowired
    public CreateReservation createReservation;

    @PostMapping("/createReservation")
    public ResponseEntity<Reservation> createGroupreservation(){
        return new ResponseEntity<>(createReservation.createReservation(4,"firstGroup"), HttpStatus.OK);
    }
}
