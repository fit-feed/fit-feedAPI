package com.fitfeed.feed.models.profiles;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private float weight;

    @Column
    private float height;

    @ManyToOne(optional=false)
    private Gender gender;

    @ManyToOne(optional = false)
    private Activity activity;

    @ManyToOne(optional = false)
    private Goal goal;


}
