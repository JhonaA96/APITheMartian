package com.parcial.elMarciano.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

    @GetMapping("/")
    public String home(){
        return "This feature its in development";
    }
}
