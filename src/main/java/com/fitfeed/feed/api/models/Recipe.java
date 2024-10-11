package com.fitfeed.feed.api.models;

import com.fitfeed.feed.api.models.enums.Diet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@NoArgsConstructor
@Getter
@Setter
public class Recipe {
	public int id;
	public String name;
	public List<Ingredient> ingredients;
	public Diet diet;
	public Number preparationTime;
	public List<Step> steps;
	public Number lipid;
	public Number carbohydrate;
	public Number protein;
	public Number calories;

	public Recipe(int id, String name, List<Ingredient> ingredients, Diet diet, Number preparationTime, List<Step> steps, Number lipid, Number carbohydrate, Number protein, Number calories){
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.diet = diet;
		this.preparationTime = preparationTime;
		this.steps = steps;
		this.lipid = lipid;
		this.carbohydrate = carbohydrate;
		this.protein = protein;
		this.calories = calories;
	}
	public boolean isValidForProfile(Profile profile){
		AtomicBoolean isValid = new AtomicBoolean(true);
		this.ingredients.forEach(ingredient -> {if(profile.allergies().contains(ingredient.allergen())){ isValid.set(false);}});
		return isValid.get();
	}
}
