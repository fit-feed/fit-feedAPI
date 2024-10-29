package com.fitfeed.feed.models.profiles;

import com.fitfeed.feed.models.Allergen;
import com.fitfeed.feed.models.Diet;
import com.fitfeed.feed.models.recipes.Recipe;
import com.fitfeed.feed.models.recipes.RecipeToProfile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

	@ManyToOne
	private Diet diet;

	@ManyToMany
	private List<Allergen> allergens;

	@ManyToMany
	private List<Recipe> favoriteRecipes;

	@OneToMany
	private List<RecipeToProfile> Recipes;

}
