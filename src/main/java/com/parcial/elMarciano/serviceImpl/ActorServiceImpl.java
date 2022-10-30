package com.parcial.elMarciano.serviceImpl;

import com.parcial.elMarciano.dao.ActorDao;
import com.parcial.elMarciano.model.Actor;
import com.parcial.elMarciano.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorDao actorDao;

    @Override
    public List<Actor> showAllActor() {
        List<Actor> actors = actorDao.findAll();
        return actors;
    }

    @Override
    public Optional<Actor> showActor(Long id) {

        Optional<Actor> actor = actorDao.findById(id);
        return actor;
    }
}
