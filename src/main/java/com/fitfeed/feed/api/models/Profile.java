package com.fitfeed.feed.api.models;

import com.fitfeed.feed.api.models.enums.*;

import java.util.List;

public record Profile(String name, Number age, Gender gender, Number height, Number weight, Diet diet, Goal goal, List<Allergen> allergies, Activity activity) {

}

