package vn.daoanhthanh.car_intern.domain.service;

import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface EngineService {
    Engine createEngine(Engine engine);
    Set<Engine> listAllEngine();
    Optional<Engine> findEngineById(UUID id);
    Optional<Set<Engine>> findEngineByManufacturer(String manufacturerName);
    Optional<Set<Engine>> findEngineByReleaseYear(int year);
    Engine updateEngine(Engine engine);
    boolean deleteEngine();
}
