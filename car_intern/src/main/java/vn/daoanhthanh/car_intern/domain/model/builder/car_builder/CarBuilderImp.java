package vn.daoanhthanh.car_intern.domain.model.builder.car_builder;

import vn.daoanhthanh.car_intern.domain.model.entity.Car;
import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

/**
 * A creational pattern to build a complex structure object
 */
public class CarBuilderImp implements CarBuilder {

    private UUID carId;

    private String model;

    private int seat;

    private String registrationNumber;

    private Engine engine;

    private UUID ownerID;

    private int cylinderCapacity;

    private LocalDateTime createdAt;

    @Override
    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    @Override
    public void setCarModel(String model) {
        this.model = model;
    }

    @Override
    public void setCarRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public void setCarEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setCarOwnerID(UUID id) {
        ownerID = id;
    }

    @Override
    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public void setCarSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public void setCreatedAt() {
        ZoneId hanoi = ZoneId.of("Asia/Bangkok");
        this.createdAt = LocalDateTime.now(hanoi);
    }

    public Car build() {
        return new Car(carId, model, seat, registrationNumber, engine, ownerID, cylinderCapacity, createdAt, LocalDateTime.now());
    }
}
