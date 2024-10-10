package com.fitfeed.feed.api.mappers;

import com.fitfeed.feed.api.dtos.RecipeDTO;
import com.fitfeed.feed.api.models.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {StepMapper.class, IngredientMapper.class})
public interface RecipeMapper {

	@Mapping(source = "ingredients", target = "ingredientDTOS")
	@Mapping(source = "steps", target = "stepDTOS")
	RecipeDTO toDTO(Recipe recipe);

	List<RecipeDTO> toDTOS(List<Recipe> recipes);
}
