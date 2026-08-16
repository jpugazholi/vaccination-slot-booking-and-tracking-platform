package com.vaccination.slotbooking.repository;

import com.vaccination.slotbooking.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {

}