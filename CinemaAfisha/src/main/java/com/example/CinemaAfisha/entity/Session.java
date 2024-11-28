package com.example.studentNews.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    public UUID id;
    @Column(name = "session_date")
    public LocalDateTime publish_date;
    @OneToMany(cascade = CascadeType.DETACH)
    private List<Ticket> tickets;
    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    public Film film;
}
