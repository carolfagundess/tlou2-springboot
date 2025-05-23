package com.devsuperior.tlou2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.tlou2.entities.Character;
import com.devsuperior.tlou2.projections.CharacterMinProjection;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author carol
 */
public interface CharacterRepository extends JpaRepository<Character, Long>{
    
    //metodo com sql nativo para retonar a lista de characters pelo id da lista
    @Query(nativeQuery = true, value = """
           SELECT tb_character.id, tb_character.name, tb_character.faction, tb_character.img_url as imgUrl, tb_character.short_description as shortDescription
           FROM tb_character
           INNER JOIN tb_belonging ON tb_character.id = tb_belonging.character_id 
           WHERE tb_belonging.list_id = :listId
           ORDER BY tb_belonging.position
                                       
    """)
    List<CharacterMinProjection> searchByList(long listId);
}
