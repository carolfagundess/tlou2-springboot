package com.devsuperior.tlou2.services;

import com.devsuperior.tlou2.dto.CharacterMinDTO;
import com.devsuperior.tlou2.entities.Character;
import java.util.List;
import com.devsuperior.tlou2.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carol
 */
@Service
public class CharacterService {
    
    @Autowired
    private CharacterRepository characterRepository;

    public List<CharacterMinDTO> findAll(){
        List<Character> result = characterRepository.findAll();
        //transforma em uma lista DTO
        return result.stream().map(x -> new CharacterMinDTO(x)).toList();
    }
}
