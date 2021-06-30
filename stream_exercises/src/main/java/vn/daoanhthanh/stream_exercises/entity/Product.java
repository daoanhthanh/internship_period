package vn.daoanhthanh.stream_exercises.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.With;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @With private Double price;
    @ManyToMany(mappedBy = "product")
    @ToString.Exclude
    private Set<Order> orders;

}
