package com.videoclub.backend.controller;

import com.videoclub.backend.data.entity.FileEntity;
import com.videoclub.backend.data.entity.MovieEntity;
import com.videoclub.backend.data.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping("/video-club/file/")
    public List<FileEntity> getAll(){
        return fileRepository.findAll();
    }

    @GetMapping("/video-club/file") // metodo que me trae por id el gender
    public Optional<List<FileEntity>> getByCodMovie(@RequestParam Integer codMovie)
    {
        return Optional.of(fileRepository.findByCodMovie(codMovie)) ;
    }
}

