package com.fitfeed.feed.api.models;

import com.fitfeed.feed.api.models.enums.Allergen;
import com.fitfeed.feed.api.models.enums.QuantityType;

public record Ingredient(String name, Number quantity, QuantityType quantityType, Allergen allergen) {
}
