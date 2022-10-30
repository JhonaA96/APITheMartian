package com.parcial.elMarciano.controller;

import com.parcial.elMarciano.model.Actor;
import com.parcial.elMarciano.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/actor/")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public ResponseEntity<?> showAllActor(){

        List<Actor> actors = StreamSupport.stream(
            actorService.showAllActor().spliterator(),
            false
        ).collect(Collectors.toList());

        if(actors.size()==0)
            return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(actors);
    }

    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> show_actor(@PathParam(value="id") Long actorId){
        Optional<Actor> oActor = actorService.showActor(actorId);
        if(oActor.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oActor);
    }
}