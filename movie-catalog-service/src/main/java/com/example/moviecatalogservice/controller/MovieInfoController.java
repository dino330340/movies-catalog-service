package com.example.moviecatalogservice.controller;

import com.example.moviecatalogservice.Repository.MovieInfoRepository;
import com.example.moviecatalogservice.model.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieInfoController {

    @Autowired
    private MovieInfoRepository movieInfoRepository;

    @PostMapping("/movie-info/save")
    public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList) {
        return movieInfoRepository.saveAll(movieInfoList);
    }
}
