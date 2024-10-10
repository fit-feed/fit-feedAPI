package com.fitfeed.feed.api.services;

import com.fitfeed.feed.api.models.Profile;
import com.fitfeed.feed.api.models.enums.*;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProfileService {

	public Profile getProfile(int id){

		switch (id){
			case 2 ->{ return new Profile(
					"Alex",24, Gender.MALE,181, 73, Diet.OMNIVORE, Goal.WEIGHT_GAIN, Collections.emptyList(), Activity.RATHER_ACTIVE
				);}
			case 3 ->{return new Profile(
					"Julie",24, Gender.FEMALE,165, 54, Diet.VEGAN, Goal.WEIGHT_MAINTENANCE, Collections.emptyList(), Activity.RATHER_ACTIVE
				);}
			default -> {return new Profile(
				"Roger",57, Gender.MALE,181, 98, Diet.OMNIVORE, Goal.WEIGHT_LOSS, List.of(Allergen.DAIRY), Activity.RATHER_ACTIVE
			);
		}
		}

	}
}
