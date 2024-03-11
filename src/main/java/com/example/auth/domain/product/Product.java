package com.example.auth.domain.product;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.access.method.P;

@Entity(name= "product")
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer price;

    public Product(ProductRequestDTO data){
        this.name = data.name();
        this.price = data.price();
    }
}
