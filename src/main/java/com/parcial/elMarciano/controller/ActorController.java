package com.parcial.elMarciano.controller;

import com.parcial.elMarciano.model.Actor;
import com.parcial.elMarciano.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        if(actors.isEmpty() || actors == null)
            return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(actors);
    }

    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> showActor(@PathParam(value="id") Long actorId){
        Optional<Actor> oActor = actorService.showActor(actorId);
        if(!oActor.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oActor);
    }
}
