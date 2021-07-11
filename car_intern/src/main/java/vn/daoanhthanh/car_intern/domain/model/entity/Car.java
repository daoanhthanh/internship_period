package vn.daoanhthanh.car_intern.domain.model.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import vn.daoanhthanh.car_intern.base.TimeStamps;
import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "cars")
public class Car implements TimeStamps {
    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private int seat;

    @Column(nullable = false)
    private String registrationNumber;

    @Column(nullable = false)
    private Engine engine;

    private UUID ownerID;

    private int cylinderCapacity;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seat == car.seat && cylinderCapacity == car.cylinderCapacity && Objects.equals(id, car.id) && Objects.equals(model, car.model) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(engine, car.engine) && Objects.equals(ownerID, car.ownerID) && Objects.equals(createdAt, car.createdAt) && Objects.equals(updatedAt, car.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, seat, registrationNumber, engine, ownerID, cylinderCapacity, createdAt, updatedAt);
    }
}
