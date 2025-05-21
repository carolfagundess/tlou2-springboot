package com.devsuperior.tlou2.services;

import com.devsuperior.tlou2.dto.CharacterDTO;
import com.devsuperior.tlou2.dto.CharacterMinDTO;
import com.devsuperior.tlou2.entities.Character;
import java.util.List;
import com.devsuperior.tlou2.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author carol
 */
@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Transactional(readOnly = true)
    //metodo para retornar dto por id
    public CharacterDTO findById(Long characterId) {
        //usamos .get() para recuperar a entidade pelo JPA do repositorio
        Character result = characterRepository.findById(characterId).get();
        return new CharacterDTO(result);
    }

    @Transactional(readOnly = true)
    public List<CharacterMinDTO> findAll() {
        List<Character> result = characterRepository.findAll();
        //transforma em uma lista DTO// REALIZADO PARA REQUISAO DO PREVIEW
        return result.stream().map(x -> new CharacterMinDTO(x)).toList();
    }

}
