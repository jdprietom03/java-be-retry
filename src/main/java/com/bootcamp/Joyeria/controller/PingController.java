package com.bootcamp.Joyeria.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return new ResponseEntity<>("pong", HttpStatus.ACCEPTED);
    }
}
