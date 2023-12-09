package com.example.m_tech.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long wheel_id;
    private int countOfWheels;

    private Long body_id;

}
