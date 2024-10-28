package com.fitfeed.feed.models.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique=true, nullable=false, length=64)
    private String username;

    @Column(unique=true, nullable=false, length=64)
    private String mail;

    @Column(nullable=false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Token> tokens;
}
