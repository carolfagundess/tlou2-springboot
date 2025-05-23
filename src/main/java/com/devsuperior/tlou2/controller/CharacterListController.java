package com.devsuperior.tlou2.controller;

import com.devsuperior.tlou2.dto.CharacterListDTO;
import com.devsuperior.tlou2.dto.CharacterMinDTO;
import com.devsuperior.tlou2.services.CharacterListService;
import com.devsuperior.tlou2.services.CharacterService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carol
 *
 * esta classe contem os verbos HTTP (endpoints)
 */
@RestController
@RequestMapping(value = "/lists")
public class CharacterListController {

    @Autowired
    private CharacterListService characterListService;
    @Autowired
    private CharacterService characterService;

    @GetMapping
    public List<CharacterListDTO> findAll() {
        List<CharacterListDTO> result = characterListService.findAll();
        return result;
    }
    
    //retorna os characters com base em um id de lista
    @GetMapping(value = "/{listId}/characters")
    public List<CharacterMinDTO> findByList(@PathVariable Long listId){
        List<CharacterMinDTO> result = characterService.findByList(listId);
        return result;
    }

}
