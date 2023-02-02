package com.videoclub.backend.controller;

import com.videoclub.backend.data.entity.FileEntity;
import com.videoclub.backend.data.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping("/video-club/file/")
    public List<FileEntity> getAll(){
        return fileRepository.findAll();
    }

}

