package com.videoclub.backend.controller;

import com.videoclub.backend.data.entity.GeneroEntity;
import com.videoclub.backend.data.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GeneroController {

    @Autowired
    private GeneroRepository generoRepository; //esto es como la instanciacion

    @GetMapping("/video-club/genero/") // metodo get que me traera los generos
    public List<GeneroEntity> getAll(){
       return generoRepository.findAll();
    }
    @GetMapping("/video-club/genero") // metodo que me trae por id el genero
    public Optional<GeneroEntity> getById(@RequestParam Integer id){ // le digo que el metodo recibe un parametro que se llama id
     //dice optional porque puede no existir y no puede retornarme error sino vacio
        return generoRepository.findById(id);
    }
    @PostMapping("/video-club/genero/")
    public GeneroEntity save (@RequestBody GeneroEntity generoEntity){
        return generoRepository.save(generoEntity);
    }
}
