package vn.daoanhthanh.car_intern.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.daoanhthanh.car_intern.domain.model.entity.Car;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {
    @Query(nativeQuery = true, value = "")//TODO: write query
    Optional<Car> getCarByNameLike(String name);

    @Query(nativeQuery = true, value ="")//TODO: write query
    Optional<Set<Car>> getVehicleByOwnerName(String ownerName);

    @Query(nativeQuery = true, value = "")//TODO: write query
    Set<Car> findVehicleByEngineCode(String engineCode);


}
