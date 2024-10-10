package com.fitfeed.feed.api.dtos;

import com.fitfeed.feed.api.models.enums.Allergen;
import com.fitfeed.feed.api.models.enums.QuantityType;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IngredientDTO {
	String name;
	Number quantity;
	QuantityType quantityType;
	Allergen allergen;
}
