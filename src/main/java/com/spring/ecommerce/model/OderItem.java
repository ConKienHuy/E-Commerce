package com.spring.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "oder_item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;
    private double price;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
