package com.parcial.elMarciano.serviceImpl;

import com.parcial.elMarciano.dao.CharacterDao;
import com.parcial.elMarciano.model.Character;
import com.parcial.elMarciano.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterDao characterDao;

    @Override
    public Iterable<Character> showAllCharacter() {
        List<Character> characters = characterDao.findAll();
        return characters;
    }

    @Override
    public Optional<Character> showChracter(Long charId) {
        Optional<Character> character = characterDao.findById(charId);
        return character;
    }
}
