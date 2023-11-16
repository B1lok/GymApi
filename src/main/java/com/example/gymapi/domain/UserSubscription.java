package com.example.gymapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "user_subscription")
public class UserSubscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

    @Column(name = "trainings_left")
    private Integer trainingsLeft;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "coach_id")
    private User coach;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate = LocalDate.now();

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

}