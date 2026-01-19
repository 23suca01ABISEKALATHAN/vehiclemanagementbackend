package com.rto.repository;

import com.rto.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Optional<Vehicle> findByChassisNumber(String chassisNumber);
    boolean existsByChassisNumber(String chassisNumber);
}
