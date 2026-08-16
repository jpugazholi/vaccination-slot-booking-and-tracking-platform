package com.vaccination.slotbooking.service;

import com.vaccination.slotbooking.entity.Vaccine;
import com.vaccination.slotbooking.repository.VaccineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService {

    private final VaccineRepository vaccineRepository;

    public VaccineService(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    public List<Vaccine> getAllVaccines() {
        return vaccineRepository.findAll();
    }

    public Vaccine getVaccineById(Long id) {
        return vaccineRepository.findById(id).orElse(null);
    }

    public Vaccine saveVaccine(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }

    public void deleteVaccine(Long id) {
        vaccineRepository.deleteById(id);
    }
}