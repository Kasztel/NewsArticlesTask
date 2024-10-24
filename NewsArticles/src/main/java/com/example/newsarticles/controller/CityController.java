package com.example.newsarticles.controller;

import com.example.newsarticles.entity.City;
import com.example.newsarticles.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    // Get all cities
    @GetMapping
    public ResponseEntity<List<City>> getAllCities() {
        List<City> cities = cityService.getAllCities();
        return ResponseEntity.ok(cities);
    }

    // Get a city by name
    @GetMapping("/{name}")
    public ResponseEntity<City> getCityByName(@PathVariable String name) {
        City city = cityService.getCityByName(name);
        return ResponseEntity.ok(city);
    }
}
