package com.fitfeed.feed.models.recipes;

import com.fitfeed.feed.models.profiles.Profile;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="recipe_profile")
public class RecipeToProfile extends Recipe {
	@Column
	private  int numberOfMeals;

	@Column
	private Date mealDate;

	@OneToOne
	private Recipe recipe;

	@OneToOne
	private Profile profile;
}
