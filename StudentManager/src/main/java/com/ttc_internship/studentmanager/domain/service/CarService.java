package com.ttc_internship.studentmanager.domain.service;

import com.ttc_internship.studentmanager.domain.model.Vehicle;
import com.ttc_internship.studentmanager.domain.model.entity.Car;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CarService {
    public Optional<Car> findVehicleByName(String vehicleName);
    public Optional<Set<Car>> findVehicleByOwnerName(String ownerName);
    public Set<Car> findVehicleByEngineCode(String engineCode);
    public List<Car> getAllCars();
    public boolean updateCar();
}
