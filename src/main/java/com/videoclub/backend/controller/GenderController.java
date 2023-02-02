package com.videoclub.backend.controller;

import com.videoclub.backend.data.entity.GenderEntity;
import com.videoclub.backend.data.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GenderController {

    @Autowired
    private GenderRepository genderRepository; //esto es como la instanciacion

    @GetMapping("/video-club/gender/") // metodo get que me traera los genders
    public List<GenderEntity> getAll(){
       return genderRepository.findAll();
    }
    @GetMapping("/video-club/gender") // metodo que me trae por id el gender
    public Optional<GenderEntity> getById(@RequestParam Integer id)
    { // le digo que el metodo recibe un parametro que se llama id
     //dice optional porque puede no existir y no puede retornarme error sino vacio
        return genderRepository.findById(id);
    }
    @PostMapping("/video-club/gender/")
    public GenderEntity save (@RequestBody GenderEntity genderEntity){
        return genderRepository.save(genderEntity);
    }
}
