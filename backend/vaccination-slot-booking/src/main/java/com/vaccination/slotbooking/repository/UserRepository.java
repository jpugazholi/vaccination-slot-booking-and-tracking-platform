package com.vaccination.slotbooking.repository;

import com.vaccination.slotbooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}