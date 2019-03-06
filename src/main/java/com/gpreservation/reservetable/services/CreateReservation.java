package com.gpreservation.reservetable.services;

import com.gpreservation.reservetable.models.Reservation;
import com.gpreservation.reservetable.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service
public class CreateReservation {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(int groupSize, String groupName){
        System.out.println("executing in this method");
        Date date = new Date();
        Reservation reservation = new Reservation();
            reservation.setDateOfReservation(getTodaysDate(date));
            reservation.setGroupName(groupName);
            reservation.setNumberOfPeople(groupSize);
            reservation.setTime(getTime(date));
            reservation.setId("randomId");
        reservationRepository.save(reservation);
        return reservation;
    }

    private String getTodaysDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    private String getTime(Date date){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return format.format(date);
    }
}
