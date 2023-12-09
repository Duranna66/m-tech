package com.example.m_tech.repo;

import com.example.m_tech.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepo extends JpaRepository<Car, Long> {
    Car findCarById(Long id);

    @Override
    <S extends Car> S save(S entity);
    List<Car> findAllBy();
}
