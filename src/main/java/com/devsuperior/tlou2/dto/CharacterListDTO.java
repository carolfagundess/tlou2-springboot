package com.devsuperior.tlou2.dto;

import com.devsuperior.tlou2.entities.CharacterList;

/**
 *
 * @author carol
 */
public class CharacterListDTO {
    private Long id;
    private String name;

    public CharacterListDTO(CharacterList list) {
        this.id = list.getId();
        this.name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}
