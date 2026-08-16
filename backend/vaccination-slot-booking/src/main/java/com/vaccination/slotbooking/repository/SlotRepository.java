package com.vaccination.slotbooking.repository;

import com.vaccination.slotbooking.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot, Long> {

}