package com.vaccination.slotbooking.controller;

import com.vaccination.slotbooking.entity.VaccinationCenter;
import com.vaccination.slotbooking.service.VaccinationCenterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/centers")
public class VaccinationCenterController {

    private final VaccinationCenterService vaccinationCenterService;

    public VaccinationCenterController(VaccinationCenterService vaccinationCenterService) {
        this.vaccinationCenterService = vaccinationCenterService;
    }

    @GetMapping
    public List<VaccinationCenter> getAllCenters() {
        return vaccinationCenterService.getAllCenters();
    }

    @GetMapping("/{id}")
    public VaccinationCenter getCenterById(@PathVariable Long id) {
        return vaccinationCenterService.getCenterById(id);
    }

    @PostMapping
    public VaccinationCenter saveCenter(@RequestBody VaccinationCenter center) {
        return vaccinationCenterService.saveCenter(center);
    }

    @DeleteMapping("/{id}")
    public void deleteCenter(@PathVariable Long id) {
        vaccinationCenterService.deleteCenter(id);
    }
}