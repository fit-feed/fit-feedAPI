package com.fitfeed.feed.api.mappers;

import com.fitfeed.feed.api.dtos.IngredientDTO;
import com.fitfeed.feed.api.models.Ingredient;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IngredientMapper {

	List<Ingredient> fromDTOS(List<IngredientDTO> ingredientDTOS);
	List<IngredientDTO> toDTOS(List<Ingredient> ingredient);

}
