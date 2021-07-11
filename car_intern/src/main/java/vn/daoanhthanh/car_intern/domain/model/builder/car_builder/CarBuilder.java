package vn.daoanhthanh.car_intern.domain.model.builder.car_builder;

import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import java.time.LocalDateTime;
import java.util.UUID;

public interface CarBuilder {
    void setCarId(UUID carid);
    void setCarModel(String model);
    void setCarRegistrationNumber(String registrationNumber);
    void setCarEngine(Engine engine);
    void setCarOwnerID(UUID ownerID);
    void setCylinderCapacity(int cylinderCapacity);
    void setCarSeat(int seat);
    void setCreatedAt();
}
