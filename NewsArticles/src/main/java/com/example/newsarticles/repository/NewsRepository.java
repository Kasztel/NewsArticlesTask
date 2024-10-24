package com.example.newsarticles.repository;

import com.example.newsarticles.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    // Custom query to find news by city name
    List<News> findByCityName(String cityName);
}
