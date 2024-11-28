package com.example.studentNews.entity;

import com.example.studentNews.ArticleStatus;
import com.example.studentNews.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="films")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Film {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    public UUID id;
    @Column(name = "name", nullable = false)
    public String name;
    @Column(name = "image", nullable = false)
    public byte[] image;
    @Column(name = "genre", nullable = false)
    public String genre;
    @Enumerated(EnumType.STRING)
    @Column(name = "discription", nullable = false)
    public String discription;
    @Enumerated(EnumType.STRING)
    @Column(name = "director", nullable = false)
    public String director;
    @Enumerated(EnumType.STRING)
    @Column(name = "lenght", nullable = false)
    @OneToMany(cascade = CascadeType.DETACH)
    private List<Session> sessions;
}
