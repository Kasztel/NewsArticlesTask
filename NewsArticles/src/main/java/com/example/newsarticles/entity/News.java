package com.example.newsarticles.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "news") // Table name in the database
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title; // Title of the news article

    @Column(nullable = false)
    private String content; // Content of the news article

    @Column(nullable = false)
    private String cityName; // City associated with the news article

    // Constructors
    public News() {}

    public News(String title, String content, String cityName) {
        this.title = title;
        this.content = content;
        this.cityName = cityName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
