package com.rto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;
    
    @NotBlank(message = "Vehicle type is required")
    @Column(nullable = false, updatable = false)
    private String vehicleType;
    
    @NotBlank(message = "Chassis number is required")
    @Column(nullable = false, unique = true, updatable = false)
    private String chassisNumber;
}
