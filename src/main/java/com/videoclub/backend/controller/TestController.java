package com.videoclub.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class TestController {
    // esta sera la url provisional
    // el metodo get trae informacion
    @PostMapping ("/video-club/test/")
    public String helloWorld(){


        return "HELLO IDIOTS";
    }
}
