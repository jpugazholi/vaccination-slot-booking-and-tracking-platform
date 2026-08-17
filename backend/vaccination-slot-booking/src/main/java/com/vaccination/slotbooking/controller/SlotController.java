package com.vaccination.slotbooking.controller;

import com.vaccination.slotbooking.entity.Slot;
import com.vaccination.slotbooking.service.SlotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/slots")
public class SlotController {

    private final SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }

    @GetMapping
    public List<Slot> getAllSlots() {
        return slotService.getAllSlots();
    }

    @GetMapping("/{id}")
    public Slot getSlotById(@PathVariable Long id) {
        return slotService.getSlotById(id);
    }

    @PostMapping
    public Slot saveSlot(@RequestBody Slot slot) {
        return slotService.saveSlot(slot);
    }

    @DeleteMapping("/{id}")
    public void deleteSlot(@PathVariable Long id) {
        slotService.deleteSlot(id);
    }
}