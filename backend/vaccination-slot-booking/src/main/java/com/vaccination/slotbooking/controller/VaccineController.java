package com.vaccination.slotbooking.controller;

import com.vaccination.slotbooking.entity.Vaccine;
import com.vaccination.slotbooking.service.VaccineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaccines")
public class VaccineController {

    private final VaccineService vaccineService;

    public VaccineController(VaccineService vaccineService) {
        this.vaccineService = vaccineService;
    }

    @GetMapping
    public List<Vaccine> getAllVaccines() {
        return vaccineService.getAllVaccines();
    }

    @GetMapping("/{id}")
    public Vaccine getVaccineById(@PathVariable Long id) {
        return vaccineService.getVaccineById(id);
    }

    @PostMapping
    public Vaccine saveVaccine(@RequestBody Vaccine vaccine) {
        return vaccineService.saveVaccine(vaccine);
    }

    @DeleteMapping("/{id}")
    public void deleteVaccine(@PathVariable Long id) {
        vaccineService.deleteVaccine(id);
    }
}