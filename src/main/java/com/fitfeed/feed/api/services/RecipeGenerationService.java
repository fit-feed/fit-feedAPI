package com.fitfeed.feed.api.services;

import com.fitfeed.feed.api.models.Profile;
import com.fitfeed.feed.api.models.Recipe;
import com.fitfeed.feed.api.models.enums.Diet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeGenerationService {
	RecipeService recipeService;

	public RecipeGenerationService(RecipeService recipeService){
		this.recipeService = recipeService;
	}
	public List<Recipe> getRecipeByProfil(Number numberOfRecipes, Profile profile){
		var recipes = this.recipeService.getRecipes().stream()
			.filter(recipe -> isAvailable(recipe.diet ,profile.diet()) && recipe.isValidForProfile(profile))
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

	private boolean isAvailable(Diet RecipeDiet, Diet ProfileDiet){
		// Un omnivore peut manger n'importe quelle recette
		if (ProfileDiet == Diet.OMNIVORE) {
			return true;
		}

		// Un végétarien peut manger des recettes végétariennes ou veganes
		if (ProfileDiet == Diet.VEGETARIAN) {
			return RecipeDiet == Diet.VEGETARIAN || RecipeDiet == Diet.VEGAN;
		}

		// Un vegan ne peut manger que des recettes veganes
		if (ProfileDiet == Diet.VEGAN) {
			return RecipeDiet == Diet.VEGAN;
		}

		// Par défaut, pas compatible
		return false;
	};
}
