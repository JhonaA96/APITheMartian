package com.parcial.elMarciano.dao;

import com.parcial.elMarciano.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends JpaRepository<Character, Long> {
}
