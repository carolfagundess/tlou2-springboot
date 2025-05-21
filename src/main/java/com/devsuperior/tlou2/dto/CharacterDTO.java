package com.devsuperior.tlou2.dto;

import org.springframework.beans.BeanUtils;
import com.devsuperior.tlou2.entities.Character;

/**
 *
 * @author carol
 */
public class CharacterDTO {

    private Long id;
    private String name;
    private String faction;
    private String genre;
    private String role;
    private String status;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public CharacterDTO() {
    }
    
    public CharacterDTO(Character entity){
        //copia os atributos da entidade para o dto, contando que estejam com nomes iguais
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    

}
