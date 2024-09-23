package com.spring.ecommerce.model;

import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String text;
    private String zipCode;
    private String country;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate createdAt;
}
