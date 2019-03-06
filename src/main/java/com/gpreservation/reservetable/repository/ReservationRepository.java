package com.gpreservation.reservetable.repository;

import com.gpreservation.reservetable.models.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation,String> {
}
