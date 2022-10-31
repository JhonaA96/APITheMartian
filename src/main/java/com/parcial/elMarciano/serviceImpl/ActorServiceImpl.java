package com.parcial.elMarciano.serviceImpl;

import com.parcial.elMarciano.dao.ActorDao;
import com.parcial.elMarciano.model.Actor;
import com.parcial.elMarciano.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Override
    public void showAges(){
        List<Actor> actors = actorDao.findAll();
        Calendar calendar = new GregorianCalendar();

        Integer year = calendar.get(Calendar.YEAR);

        for (Actor actor: actors){
            Calendar year1 =  dateToCalendar(actor.getBornDate());
            Integer age = year - year1.get(Calendar.YEAR);

            System.out.println("name: " + actor.getFirstName()+
                    " age: " + age);
        }
    }

    public Calendar dateToCalendar(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return  calendar;

    }
}
