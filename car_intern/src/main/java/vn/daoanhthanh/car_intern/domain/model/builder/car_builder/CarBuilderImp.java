package vn.daoanhthanh.car_intern.domain.model.builder.car_builder;

import vn.daoanhthanh.car_intern.domain.model.entity.Car;
import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

import org.springframework.stereotype.Component;

/**
 * A creational pattern to build a complex structure object
 */
@Component
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
    public CarBuilder setCarId(UUID carId) {
        this.carId = carId;
        return this;
    }

    @Override
    public CarBuilder setCarModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setCarRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    @Override
    public CarBuilder setCarEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setCarOwnerID(UUID id) {
        ownerID = id;
        return this;
    }

    @Override
    public CarBuilder setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
        return this;
    }

    @Override
    public CarBuilder setCarSeat(int seat) {
        this.seat = seat;
        return this;
    }

    @Override
    public CarBuilder setCreatedAt() {
        ZoneId hanoi = ZoneId.of("Asia/Bangkok");
        this.createdAt = LocalDateTime.now(hanoi);
        return this;
    }

    public Car build() {
        return new Car(carId, model, seat, registrationNumber, engine, ownerID, cylinderCapacity, createdAt,
                LocalDateTime.now(ZoneId.of("Asia/Bangkok")));
    }
}
