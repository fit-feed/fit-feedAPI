package com.fitfeed.feed.models.recipes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private float proteins;

    @Column(nullable = false)
    private float carbohydrates;

    @Column(nullable = false)
    private float lipids;

    @Column(nullable = false)
    private float calories;

    @Column
    private Number preparationTime;







}
