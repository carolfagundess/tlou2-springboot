package com.devsuperior.tlou2.repositories;

import com.devsuperior.tlou2.entities.CharacterList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carol
 */
public interface CharacterListRepository extends JpaRepository<CharacterList, Long>{
    
}
