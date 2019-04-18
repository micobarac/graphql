package com.acme.graphql.domain;

import com.acme.graphql.domain.enums.Animal;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Animal type;

    private int age;
}
