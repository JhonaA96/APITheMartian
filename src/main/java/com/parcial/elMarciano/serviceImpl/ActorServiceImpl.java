package com.parcial.elMarciano.serviceImpl;

import com.parcial.elMarciano.model.Actor;
import com.parcial.elMarciano.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActorServiceImpl implements ActorService {

    @Autowired

    @Override
    public List<Actor> showAllActor() {
        return null;
    }

    @Override
    public List<Actor> showActor(Long id) {
        return null;
    }
}
