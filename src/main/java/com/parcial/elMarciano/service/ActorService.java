package com.parcial.elMarciano.service;

import com.parcial.elMarciano.model.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActorService {
    List<Actor> showAllActor();
    List<Actor> showActor(Long id);
}
