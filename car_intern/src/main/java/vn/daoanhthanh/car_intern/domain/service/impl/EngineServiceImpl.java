package vn.daoanhthanh.car_intern.domain.service.impl;

import org.springframework.stereotype.Service;
import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;
import vn.daoanhthanh.car_intern.domain.service.EngineService;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class EngineServiceImpl implements EngineService {
    @Override
    public Engine createEngine(Engine engine) {
        return null;
    }

    @Override
    public Set<Engine> listAllEngine() {
        return null;
    }

    @Override
    public Optional<Engine> findEngineById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Set<Engine>> findEngineByManufacturer(String manufacturerName) {
        return Optional.empty();
    }

    @Override
    public Optional<Set<Engine>> findEngineByReleaseYear(int year) {
        return Optional.empty();
    }

    @Override
    public Engine updateEngine(Engine engine) {
        return null;
    }

    @Override
    public boolean deleteEngine() {
        return false;
    }
}
