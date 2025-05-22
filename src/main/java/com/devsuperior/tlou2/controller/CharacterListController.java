package com.devsuperior.tlou2.controller;

import com.devsuperior.tlou2.dto.CharacterListDTO;
import com.devsuperior.tlou2.services.CharacterListService;
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
@RequestMapping(value = "/list")
public class CharacterListController {

    @Autowired
    private CharacterListService characterListService;

    @GetMapping
    public List<CharacterListDTO> findAll() {
        List<CharacterListDTO> result = characterListService.findAll();
        return result;
    }

}
