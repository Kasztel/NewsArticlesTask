package com.example.newsarticles.service;

import com.example.newsarticles.entity.City;
import com.example.newsarticles.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    // Get all cities from the database
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    // Get a city by name
    public City getCityByName(String name) {
        return cityRepository.findByName(name);
    }
}
