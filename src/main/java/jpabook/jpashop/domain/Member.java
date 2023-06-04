package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author Kim Juon
 */
@Entity
@Getter @Setter
public class Member extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders;
}
