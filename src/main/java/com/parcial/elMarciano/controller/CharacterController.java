package com.parcial.elMarciano.controller;

import com.parcial.elMarciano.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.parcial.elMarciano.model.Character;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/character/")
public class CharacterController{

    @Autowired
    private CharacterService characterService;

    @GetMapping
    public ResponseEntity<?> showAllCharacter(){
        List<Character> characters = StreamSupport.stream(
                    characterService.showAllCharacter().spliterator(),
             false).
                collect(Collectors.toList());

        if(characters.isEmpty())
            return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(characters);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> showCharacter(@PathParam(value ="id") Long characId){
        Optional<Character> character = characterService.showChracter(characId);

        if(!character.isPresent())
            return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(character);
    }

}
