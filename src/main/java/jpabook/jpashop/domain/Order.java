package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Kim Juon
 */
@Entity
@Table(name = "ORDERS")
@Getter @Setter
public class Order extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    public void addOrderItem(OrderItem orderItem) {
        this.orderItems = Objects.isNull(this.orderItems) ? new ArrayList<>() : this.orderItems;
        this.orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
