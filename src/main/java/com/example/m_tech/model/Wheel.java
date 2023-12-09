package com.example.m_tech.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Wheel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int size;
    private String color;


}
