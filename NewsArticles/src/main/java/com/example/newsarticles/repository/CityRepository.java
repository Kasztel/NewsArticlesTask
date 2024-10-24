package com.example.newsarticles.repository;

import com.example.newsarticles.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    // Custom query to find a city by name
    City findByName(String name);
}
