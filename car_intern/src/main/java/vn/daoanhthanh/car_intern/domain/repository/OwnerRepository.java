package vn.daoanhthanh.car_intern.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.daoanhthanh.car_intern.domain.model.entity.Owner;

import java.util.UUID;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, UUID> {

}
