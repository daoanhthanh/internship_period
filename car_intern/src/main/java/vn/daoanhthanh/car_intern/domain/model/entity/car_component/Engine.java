package vn.daoanhthanh.car_intern.domain.model.entity.car_component;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;
import vn.daoanhthanh.car_intern.base.TimeStamps;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "engines")
public class Engine implements TimeStamps {
    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private String engineCode;

    private short horsePower;

    private String manufacturer;

    private boolean isQualified;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Engine engine = (Engine) o;

        return Objects.equals(id, engine.id);
    }

    @Override
    public int hashCode() {
        return 533444529;
    }
}
