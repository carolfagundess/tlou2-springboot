package com.devsuperior.tlou2.services;

import com.devsuperior.tlou2.dto.CharacterListDTO;
import com.devsuperior.tlou2.entities.CharacterList;
import com.devsuperior.tlou2.repositories.CharacterListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author carol
 */
@Service
public class CharacterListService {

    @Autowired
    private CharacterListRepository characterListRepository;

    @Transactional(readOnly = true)
    public List<CharacterListDTO> findAll() {
        List<CharacterList> result = characterListRepository.findAll();
        //pega cada elemento da lista e converte para um objeto dto
        return result.stream().map(x -> new CharacterListDTO(x)).toList();
    }
}
