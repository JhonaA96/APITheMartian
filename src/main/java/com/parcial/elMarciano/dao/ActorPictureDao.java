package com.parcial.elMarciano.dao;

import com.parcial.elMarciano.model.ActorPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorPictureDao extends JpaRepository<ActorPicture, Long> {
}
