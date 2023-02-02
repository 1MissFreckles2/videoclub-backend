package com.videoclub.backend.controller;

import com.videoclub.backend.data.entity.GenderEntity;
import com.videoclub.backend.data.entity.MovieEntity;
import com.videoclub.backend.data.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/video-club/movie/")
    public List<MovieEntity> getAll(){
        return movieRepository.findAll();
    }
    @GetMapping("/video-club/movie") // metodo que me trae por id el gender
    public Optional <List<MovieEntity>> getByCodGender(@RequestParam Integer codGender)
    { // le digo que el metodo recibe un parametro que se llama id
        //dice optional porque puede no existir y no puede retornarme error sino vacio
        return Optional.of(movieRepository.findByCodGender(codGender)) ;
    }
}
