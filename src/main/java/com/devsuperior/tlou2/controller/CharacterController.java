package com.devsuperior.tlou2.controller;

import com.devsuperior.tlou2.dto.CharacterMinDTO;
import com.devsuperior.tlou2.services.CharacterService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carol
 * 
 * esta classe contem os verbos HTTP (endpoints)
 */
@RestController 
@RequestMapping(value = "/characters")
public class CharacterController {
    
    @Autowired
    private CharacterService characterService;
    
    @GetMapping
    public List<CharacterMinDTO> findAll(){
        List<CharacterMinDTO> result = characterService.findAll();
        return result;
        
    }
}
