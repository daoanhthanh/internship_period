package vn.daoanhthanh.car_intern.domain.model.builder.car_builder;

import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import java.util.UUID;

public interface CarBuilder {
    CarBuilder setCarId(UUID carId);

    CarBuilder setCarModel(String model);

    CarBuilder setCarRegistrationNumber(String registrationNumber);

    CarBuilder setCarEngine(Engine engine);

    CarBuilder setCarOwnerID(UUID ownerID);

    CarBuilder setCylinderCapacity(int cylinderCapacity);

    CarBuilder setCarSeat(int seat);

    CarBuilder setCreatedAt();
}
