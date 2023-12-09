package com.example.m_tech.repo;

import com.example.m_tech.model.Body;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BodyRepo extends JpaRepository<Body, Long> {
    List<Body> getBodiesBy();
    Body findBodyById(Long id);
}
