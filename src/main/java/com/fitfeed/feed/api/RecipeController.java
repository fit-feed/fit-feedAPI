package com.fitfeed.feed.api;

import com.fitfeed.feed.api.dtos.ProfileDTO;
import com.fitfeed.feed.api.dtos.RecipeDTO;
import com.fitfeed.feed.api.mappers.ProfileMapper;
import com.fitfeed.feed.api.mappers.RecipeMapper;
import com.fitfeed.feed.api.services.ProfileService;
import com.fitfeed.feed.api.services.RecipeGenerationService;
import com.fitfeed.feed.api.services.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/v1/recipes")
public class RecipeController {

	private final RecipeGenerationService recipeGenerationService;
	private final RecipeService recipeService;
	private final ProfileMapper profileMapper;
	private final RecipeMapper recipeMapper;
	private final ProfileService profileService;

	@GetMapping
	public ResponseEntity<List<RecipeDTO>> getRecipes(){
		return ResponseEntity.ok(recipeMapper.toDTOS(recipeService.getRecipes()));
	}

	@GetMapping("/{profileId}/{id}")
	public ResponseEntity<List<RecipeDTO>> getGenerateRecipe(@PathVariable int profileId, @PathVariable() int id ){
		return ResponseEntity.ok(
		recipeMapper.toDTOS(
			recipeGenerationService.getRecipeByProfil(id ,this.profileService.getProfile(profileId))
			)
		);
	}
}
