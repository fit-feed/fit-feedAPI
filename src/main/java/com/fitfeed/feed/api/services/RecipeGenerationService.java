package com.fitfeed.feed.api.services;

import com.fitfeed.feed.api.models.Profile;
import com.fitfeed.feed.api.models.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeGenerationService {
	RecipeService recipeService;

	public RecipeGenerationService(RecipeService recipeService){
		this.recipeService = recipeService;
	}
	public List<Recipe> getRecipeByProfil(Number numberOfRecipes, Profile profile){
		System.out.println(profile.diet().toString());
		var recipes = this.recipeService.getRecipes().stream()
			.filter(recipe -> recipe.diet == profile.diet() && recipe.isValidForProfile(profile))
			.toList();

		if(recipes.size() > numberOfRecipes.intValue()){ recipes =  recipes.subList(0,numberOfRecipes.intValue() - 1);}
		return  recipes;
	}

	private Number GetCalories(Profile profile){
        var baseMetabolism = (13.707 * profile.weight().doubleValue()) + (492.3 * (profile.height().doubleValue()/100)) - (6.673 * profile.age().doubleValue()) + 77.607;
		var appliedActivity = baseMetabolism * getActivityCoef(profile).doubleValue();
		return appliedActivity * getGoalCoef(profile).doubleValue();
	}
	private Number getActivityCoef(Profile profile){
		switch (profile.activity()){
			case SEDENTARY -> {return 1.2;}
			case ACTIVE -> {return 1.55;}
			case VERY_ACTIVE -> {return 1.725;}
			default -> {
				return 1.375;
			}
		}
	}
	private Number getGoalCoef(Profile profile){
		switch (profile.goal()){
			case WEIGHT_GAIN -> {return 1.15;}
			case WEIGHT_LOSS -> {return 0.85;}
			default -> {
				return 1;
			}
		}
	}
}
