package com.devsuperior.tlou2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author carol
 */
@Entity
@Table(name = "tb_character")
public class Character {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String faction;
    private String genre;
    private String role;
    private String status;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;  // Corrigido de longDecription

    public Character() {
    }

    public Character(Long id, String name, String faction, String genre, String role, String status, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.name = name;
        this.faction = faction;
        this.genre = genre;
        this.role = role;
        this.status = status;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
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

    public String getFaction() {  // Corrigido de getFacfaction
        return faction;
    }

    public void setFaction(String faction) {  // Corrigido de setFacfaction
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

    public String getLongDescription() {  // Corrigido de getLongDecription
        return longDescription;
    }

    public void setLongDescription(String longDescription) {  // Corrigido de setLongDecription
        this.longDescription = longDescription;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        return Objects.equals(this.id, other.id);
    }
    
}
