package com.example.newsarticles.controller;

import com.example.newsarticles.entity.News;
import com.example.newsarticles.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    // Get news by city name
    @GetMapping("/{cityName}")
    public ResponseEntity<List<News>> getNewsForCity(@PathVariable String cityName) {
        List<News> newsList = newsService.getNewsByCity(cityName);
        return ResponseEntity.ok(newsList);
    }
}
