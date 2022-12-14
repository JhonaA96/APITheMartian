package com.parcial.elMarciano.service;

import com.parcial.elMarciano.model.Actor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Optional;

@Service
public interface ActorService {
    Iterable<Actor> showAllActor();
    Optional<Actor> showActor(Long id);

    void showAges();

}
