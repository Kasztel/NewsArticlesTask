package com.example.newsarticles.service;

import com.example.newsarticles.entity.News;
import com.example.newsarticles.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    // Get news by city name
    public List<News> getNewsByCity(String cityName) {
        return newsRepository.findByCityName(cityName);
    }
}
