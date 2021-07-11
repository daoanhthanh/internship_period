package vn.daoanhthanh.car_intern.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import java.util.UUID;

public interface EngineRepository extends JpaRepository<Engine, UUID> {
}
