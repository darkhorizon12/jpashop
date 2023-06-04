package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author Kim Juon
 */
@Entity
@Setter @Getter
public class Album extends Item {
    private String artist;
    private String etc;
}
