package vn.daoanhthanh.car_intern.domain.model.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import vn.daoanhthanh.car_intern.base.TimeStamps;
import vn.daoanhthanh.car_intern.domain.model.entity.car_component.Engine;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "cars")
//@Builder(toBuilder = true)
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

}
