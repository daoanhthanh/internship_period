package vn.daoanhthanh.car_intern.domain.service.impl;

import org.springframework.stereotype.Service;
import vn.daoanhthanh.car_intern.domain.model.entity.Car;
import vn.daoanhthanh.car_intern.domain.service.CarService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public Car createCar(Car car) {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public Optional<Car> findCarByName(String vehicleName) {
        return Optional.empty();
    }

    @Override
    public Optional<Car> findCarById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Set<Car>> findCarByOwnerName(String ownerName) {
        return Optional.empty();
    }

    @Override
    public Set<Car> findCarByEngineCode(String engineCode) {
        return null;
    }

    @Override
    public Car updateCar() {
        return null;
    }

    @Override
    public boolean deleteCar() {
        return false;
    }
}
