package vn.daoanhthanh.car_intern.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.daoanhthanh.car_intern.domain.model.entity.Car;
import vn.daoanhthanh.car_intern.domain.repository.CarRepository;
import vn.daoanhthanh.car_intern.domain.service.CarService;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository repo;

    @Override
    public Car createCar(Car car) {
        return repo.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return repo.findAll();
    }

    @Override
    public List<Car> findCarByName(String vehicleName) {
        return repo.getCarByNameLike(vehicleName);
    }

    @Override
    public Optional<Car> findCarById(UUID id) {
        return repo.findById(id);
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
    public Car updateCar(Car car) {
        return repo.save(car);
    }

    @Override
    public void deleteCar(UUID id) {
        repo.deleteById(id);
    }
}
