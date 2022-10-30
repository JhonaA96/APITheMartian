package com.parcial.elMarciano.service;

import com.parcial.elMarciano.model.Character;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public interface CharacterService {

    Iterable<Character> showAllCharacter();
    Optional<Character> showChracter(Long Id);
}
