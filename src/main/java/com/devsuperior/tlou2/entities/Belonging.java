
package com.devsuperior.tlou2.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author carol
 */
@Entity
@Table(name = "tb_belonging")
public class Belonging {
    
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer postion;

    public Belonging() {
    }

    public Belonging(Character character, CharacterList list, Integer postion) {
        id.setCharacter(character);
        id.setList(list);
        this.postion = postion;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPostion() {
        return postion;
    }

    public void setPostion(Integer postion) {
        this.postion = postion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final Belonging other = (Belonging) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
