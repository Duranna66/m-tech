package com.example.m_tech.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Body {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeBody;
    private String color;

}
