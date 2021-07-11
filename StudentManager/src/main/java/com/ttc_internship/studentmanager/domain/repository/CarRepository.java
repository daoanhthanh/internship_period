package com.ttc_internship.studentmanager.domain.repository;

import com.ttc_internship.studentmanager.domain.model.Vehicle;
import com.ttc_internship.studentmanager.domain.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {
    @Query(nativeQuery = true, value = "")//TODO: write query
    Optional<Car> getCarByNameLike(String name);

    @Query(nativeQuery = true, value ="")//TODO: write query
    public Optional<Set<Car>> getVehicleByOwnerName(String ownerName);

    @Query(nativeQuery = true, value = "")//TODO: write query
    public Set<Car> findVehicleByEngineCode(String engineCode);


}
