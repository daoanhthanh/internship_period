package vn.daoanhthanh.car_intern.domain.model.entity;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;
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
@Table(name = "owners")
public class Owner implements Persistable<UUID>, TimeStamps {
    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(length = 150)
    private String name;

    @Column(name="phone", length = 10, nullable = false)
    private String phoneNumber;

    private String driveLicense;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Override
    public boolean isNew() {
        return id == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Owner owner = (Owner) o;

        return Objects.equals(id, owner.id);
    }

    @Override
    public int hashCode() {
        return 1449427326;
    }
}
