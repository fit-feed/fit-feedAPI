package com.fitfeed.feed.api.dtos;

import com.fitfeed.feed.api.models.enums.Diet;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Builder
@Data
public class RecipeDTO {
	String name;
	List<IngredientDTO> ingredientDTOS;
	Diet diet;
	Timestamp preparationTime;
	List<StepDTO> stepDTOS;
	Number lipid;
	Number carbohydrate;
	Number protein;
	Number calories;
}
