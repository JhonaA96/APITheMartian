package com.parcial.elMarciano.controller;

import com.parcial.elMarciano.model.AboutUs;
import com.parcial.elMarciano.service.AboutUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> aboutUs(){

        List<AboutUs> about = StreamSupport.stream(
                    aboutUsService.getAll()
                    .spliterator(), false)
                .collect(Collectors.toList());
        if(about.isEmpty() || about == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(about);
    }
}
