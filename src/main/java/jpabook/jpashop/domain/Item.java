package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author Kim Juon
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
@Getter @Setter
public abstract class Item extends BaseEntity {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories;

    private String name;
    private int price;
    private int stockQuantity;
}
