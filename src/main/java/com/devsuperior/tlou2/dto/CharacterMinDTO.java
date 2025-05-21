package com.devsuperior.tlou2.dto;

import com.devsuperior.tlou2.entities.Character;

/**
 *
 * @author carol
 * UMA VERSAO DA ENTIDADE COM APENAS 5 DADOS (PREVIEW)
 * REQUISACAO PARA APENAS 5 CAMPOS
 */
public class CharacterMinDTO {

    private Long id;
    private String name;
    private String faction;
    private String imgUrl;
    private String shortDescription;

    public CharacterMinDTO() {
    }

    public CharacterMinDTO(Character entity) {
        id = entity.getId();
        name = entity.getName();
        faction = entity.getFaction();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaction() {
        return faction;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

}
