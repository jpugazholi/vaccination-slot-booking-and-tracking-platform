package com.vaccination.slotbooking.service;

import com.vaccination.slotbooking.entity.VaccinationCenter;
import com.vaccination.slotbooking.repository.VaccinationCenterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationCenterService {

    private final VaccinationCenterRepository vaccinationCenterRepository;

    public VaccinationCenterService(VaccinationCenterRepository vaccinationCenterRepository) {
        this.vaccinationCenterRepository = vaccinationCenterRepository;
    }

    public List<VaccinationCenter> getAllCenters() {
        return vaccinationCenterRepository.findAll();
    }

    public VaccinationCenter getCenterById(Long id) {
        return vaccinationCenterRepository.findById(id).orElse(null);
    }

    public VaccinationCenter saveCenter(VaccinationCenter center) {
        return vaccinationCenterRepository.save(center);
    }

    public void deleteCenter(Long id) {
        vaccinationCenterRepository.deleteById(id);
    }
}