package com.example.m_tech.repo;

import com.example.m_tech.model.Wheel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WheelRepo extends JpaRepository<Wheel, Long> {
    List<Wheel> getAllBy();

}
