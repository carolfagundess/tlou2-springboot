package com.devsuperior.tlou2.dto;

import com.devsuperior.tlou2.entities.Character;
import com.devsuperior.tlou2.projections.CharacterMinProjection;

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
    
    //metodo construtor que recebe um projection e constroi um objeto dto
    public CharacterMinDTO(CharacterMinProjection projection) {
        id = projection.getId();
        name = projection.getName();
        faction = projection.getFaction();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
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
