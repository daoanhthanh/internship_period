package vn.daoanhthanh.car_intern.domain.service;

import vn.daoanhthanh.car_intern.domain.model.entity.Car;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface CarService {
    Car createCar(Car car);

    List<Car> getAllCars();

    List<Car> findCarByName(String vehicleName);

    Optional<Car> findCarById(UUID id);

    Optional<Set<Car>> findCarByOwnerName(String ownerName);

    Set<Car> findCarByEngineCode(String engineCode);

    Car updateCar(Car car);

    void deleteCar(UUID id);

}
