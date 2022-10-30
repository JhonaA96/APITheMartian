package com.parcial.elMarciano.dao;

import com.parcial.elMarciano.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActorDao extends JpaRepository<Actor, Long> {

}
