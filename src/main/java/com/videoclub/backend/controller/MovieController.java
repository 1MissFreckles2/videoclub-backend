package com.videoclub.backend.controller;

import com.videoclub.backend.data.entity.MovieEntity;
import com.videoclub.backend.data.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/video-club/movie/")
    public List<MovieEntity> getAll(){
        return movieRepository.findAll();
    }
}
