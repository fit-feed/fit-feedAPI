package com.fitfeed.feed.api.dtos;
import com.fitfeed.feed.api.models.enums.*;
import lombok.ToString;

import java.util.List;

public class ProfileDTO {
	String name;
	Number age;
	Gender gender;
	Number height;
	Number weight;
	Diet diet;
	Goal goal;
	List<Allergen> allergens;
	Activity activity;
}
