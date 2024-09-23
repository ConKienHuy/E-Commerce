package com.spring.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "payment")
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String status;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private LocalDate createdAt;
}
