package vn.daoanhthanh.car_intern.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.daoanhthanh.car_intern.domain.model.entity.Owner;

import java.util.UUID;

public interface OwnerRepository extends JpaRepository<Owner, UUID> {

}
