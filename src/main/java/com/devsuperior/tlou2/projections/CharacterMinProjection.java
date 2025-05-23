
package com.devsuperior.tlou2.projections;

/**
 *
 * @author carol
 */
public interface CharacterMinProjection {
    
    Long getId();
    String getName();
    String getFaction();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
