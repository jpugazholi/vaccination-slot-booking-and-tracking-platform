package com.vaccination.slotbooking.repository;

import com.vaccination.slotbooking.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}