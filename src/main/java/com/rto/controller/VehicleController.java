package com.rto.controller;

import com.rto.dto.UpdateVehicleDTO;
import com.rto.dto.VehicleDTO;
import com.rto.service.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "http://localhost:3000")
public class VehicleController {
    
    @Autowired
     private VehicleService vehicleService;
    
    @GetMapping
    public ResponseEntity<List<VehicleDTO>> getAllVehicles() {
        List<VehicleDTO> vehicles = vehicleService.getAllVehicles();
        return ResponseEntity.ok(vehicles);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<VehicleDTO> getVehicleById(@PathVariable Long id) {
        try {
            VehicleDTO vehicle = vehicleService.getVehicleById(id);
            return ResponseEntity.ok(vehicle);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<?> createVehicle(@Valid @RequestBody VehicleDTO vehicleDTO) {
        try {
            VehicleDTO createdVehicle = vehicleService.createVehicle(vehicleDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdVehicle);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> updateVehicleName(@PathVariable Long id, @Valid @RequestBody UpdateVehicleDTO updateDTO) {
        try {
            VehicleDTO updatedVehicle = vehicleService.updateVehicleName(id, updateDTO);
            return ResponseEntity.ok(updatedVehicle);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
        try {
            vehicleService.deleteVehicle(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
