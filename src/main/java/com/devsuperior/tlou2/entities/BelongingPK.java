package com.devsuperior.tlou2.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

/**
 *
 * @author carol
 * classe para gerar a chave primaria de belonging
 */

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private CharacterList list;

    public BelongingPK() {
    }

    public BelongingPK(Character character, CharacterList list) {
        this.character = character;
        this.list = list;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public CharacterList getList() {
        return list;
    }

    public void setList(CharacterList list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.character);
        hash = 29 * hash + Objects.hashCode(this.list);
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
        final BelongingPK other = (BelongingPK) obj;
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return Objects.equals(this.list, other.list);
    }

}
