package com.devsuperior.tlou2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.tlou2.entities.Character;

/**
 *
 * @author carol
 */
public interface CharacterRepository extends JpaRepository<Character, Long>{
    
}
