package com.parcial.elMarciano.controller;

import com.parcial.elMarciano.model.AboutUs;
import com.parcial.elMarciano.service.AboutUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/about")
public class AboutController {

    @Autowired
    private AboutUsService aboutUsService;

    @GetMapping
    public List<AboutUs> aboutUs(){

        List<AboutUs> about = StreamSupport.stream(
                    aboutUsService.getAll()
                    .spliterator(), false)
                .collect(Collectors.toList());
        return about;
    }
}
