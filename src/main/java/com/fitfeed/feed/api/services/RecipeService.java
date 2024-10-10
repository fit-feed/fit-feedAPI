package com.fitfeed.feed.api.services;

import com.fitfeed.feed.api.models.Ingredient;
import com.fitfeed.feed.api.models.Recipe;
import com.fitfeed.feed.api.models.Step;
import com.fitfeed.feed.api.models.enums.Allergen;
import com.fitfeed.feed.api.models.enums.Diet;
import com.fitfeed.feed.api.models.enums.QuantityType;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class RecipeService {
	public List<Recipe> getRecipes(){
		return List.of(
			new Recipe("Salade de quinoa aux légumes",
				List.of(
					new Ingredient("Quinoa", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Tomate", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Concombre", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Avocat", 1, QuantityType.PART, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(1800),
				List.of(
					new Step("Préparer le quinoa", "Faire cuire le quinoa pendant 15 minutes."),
					new Step("Mélanger les légumes", "Couper les légumes et les mélanger avec le quinoa.")
				),
				10, 40, 12, 350
			),

			new Recipe("Omelette aux champignons",
				List.of(
					new Ingredient("Oeufs", 3, QuantityType.PART, Allergen.EGGS),
					new Ingredient("Champignon", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Beurre", 10, QuantityType.GRAM, Allergen.DAIRY)
				),
				Diet.OMNIVORE, new Timestamp(1200),
				List.of(
					new Step("Battre les oeufs", "Battre les oeufs dans un bol."),
					new Step("Cuire les champignons", "Faire revenir les champignons dans du beurre."),
					new Step("Cuire l'omelette", "Verser les oeufs dans la poêle et cuire.")
				),
				20, 5, 18, 250
			),

			new Recipe("Curry de lentilles",
				List.of(
					new Ingredient("Lentilles", 150, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Lait de coco", 200, QuantityType.MILLILITER, Allergen.NONE),
					new Ingredient("Épinards", 50, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Oignon", 1, QuantityType.PART, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(2400),
				List.of(
					new Step("Préparer les lentilles", "Faire cuire les lentilles dans l'eau bouillante."),
					new Step("Faire le curry", "Mélanger le lait de coco et les épices avec les lentilles.")
				),
				15, 60, 15, 450
			),

			new Recipe("Poulet grillé aux légumes",
				List.of(
					new Ingredient("Poulet", 200, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Brocoli", 150, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Carotte", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Huile d'olive", 10, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.OMNIVORE, new Timestamp(1800),
				List.of(
					new Step("Griller le poulet", "Faire griller le poulet jusqu'à ce qu'il soit bien cuit."),
					new Step("Cuire les légumes", "Faire cuire les légumes à la vapeur.")
				),
				25, 30, 40, 600
			),

			new Recipe("Soupe de patate douce et carottes",
				List.of(
					new Ingredient("Patate douce", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Carotte", 3, QuantityType.PART, Allergen.NONE),
					new Ingredient("Lait de coco", 100, QuantityType.MILLILITER, Allergen.NONE)
				),
				Diet.GLUTEN_FREE, new Timestamp(2400),
				List.of(
					new Step("Cuire les légumes", "Faire cuire les patates douces et les carottes."),
					new Step("Mixer la soupe", "Mixer les légumes avec le lait de coco.")
				),
				10, 50, 5, 300
			),

			new Recipe("Pâtes sans gluten à la sauce tomate",
				List.of(
					new Ingredient("Pâtes sans gluten", 200, QuantityType.GRAM, Allergen.GLUTEN),
					new Ingredient("Tomate", 4, QuantityType.PART, Allergen.NONE),
					new Ingredient("Basilic", 5, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.GLUTEN_FREE, new Timestamp(1800),
				List.of(
					new Step("Cuire les pâtes", "Faire cuire les pâtes sans gluten selon les instructions."),
					new Step("Préparer la sauce", "Faire revenir les tomates avec du basilic.")
				),
				5, 70, 10, 400
			),

			new Recipe("Tofu sauté aux légumes",
				List.of(
					new Ingredient("Tofu", 200, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Brocoli", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Carotte", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Sauce soja", 20, QuantityType.MILLILITER, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(1200),
				List.of(
					new Step("Préparer le tofu", "Faire revenir le tofu dans une poêle avec de l'huile."),
					new Step("Ajouter les légumes", "Ajouter les légumes coupés et la sauce soja.")
				),
				15, 20, 20, 350
			),

			new Recipe("Riz au lait sans lactose",
				List.of(
					new Ingredient("Riz", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Lait d'amande", 300, QuantityType.MILLILITER, Allergen.TREE_NUTS),
					new Ingredient("Sucre", 20, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.LACTOSE_FREE, new Timestamp(2400),
				List.of(
					new Step("Cuire le riz", "Faire cuire le riz dans le lait d'amande."),
					new Step("Ajouter le sucre", "Ajouter le sucre à la préparation.")
				),
				5, 80, 10, 450
			),

			new Recipe("Galettes de légumes",
				List.of(
					new Ingredient("Carotte", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Courgette", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Farine sans gluten", 100, QuantityType.GRAM, Allergen.GLUTEN)
				),
				Diet.GLUTEN_FREE, new Timestamp(1800),
				List.of(
					new Step("Préparer la pâte", "Mélanger les légumes râpés et la farine."),
					new Step("Cuire les galettes", "Faire cuire les galettes dans une poêle.")
				),
				5, 30, 8, 300
			)
		);
	}
}
