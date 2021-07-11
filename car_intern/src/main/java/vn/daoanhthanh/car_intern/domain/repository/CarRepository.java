package vn.daoanhthanh.car_intern.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.daoanhthanh.car_intern.domain.model.entity.Car;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {
    @Query(nativeQuery = true, value = "") // TODO: write query
    List<Car> getCarByNameLike(String name);

    @Query(nativeQuery = true, value = "") // TODO: write query
    Optional<Set<Car>> getVehicleByOwnerName(String ownerName);

    @Query(nativeQuery = true, value = "") // TODO: write query
    Set<Car> findVehicleByEngineCode(String engineCode);

}
