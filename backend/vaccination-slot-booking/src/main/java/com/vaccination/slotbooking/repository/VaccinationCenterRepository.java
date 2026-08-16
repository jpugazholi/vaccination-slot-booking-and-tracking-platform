package com.vaccination.slotbooking.repository;

import com.vaccination.slotbooking.entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter, Long> {

}