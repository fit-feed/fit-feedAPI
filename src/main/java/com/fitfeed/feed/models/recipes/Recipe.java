package com.fitfeed.feed.models.recipes;

import com.fitfeed.feed.models.Diet;
import com.fitfeed.feed.models.Picture;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

	@ManyToOne
	private RecipeType recipeType;

	@ManyToOne
	private Diet diet;

	@OneToMany
	private List<Step> steps;

	@OneToMany
	private List<Picture> pictures;

}
