package com.vaccination.slotbooking.repository;

import com.vaccination.slotbooking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}