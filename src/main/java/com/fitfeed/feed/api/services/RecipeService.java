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
			),

			new Recipe("Risotto aux champignons",
				List.of(
					new Ingredient("Riz Arborio", 150, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Champignons", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Parmesan", 50, QuantityType.GRAM, Allergen.DAIRY),
					new Ingredient("Bouillon de légumes", 500, QuantityType.MILLILITER, Allergen.NONE)
				),
				Diet.OMNIVORE, new Timestamp(2700),
				List.of(
					new Step("Préparer le risotto", "Faire cuire le riz en ajoutant progressivement le bouillon."),
					new Step("Ajouter les champignons", "Faire revenir les champignons et les mélanger au riz.")
				),
				15, 70, 12, 500
			),

			// Nouvelle recette 2 : Smoothie banane et amandes
			new Recipe("Smoothie banane et amandes",
				List.of(
					new Ingredient("Banane", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Lait d'amande", 250, QuantityType.MILLILITER, Allergen.TREE_NUTS),
					new Ingredient("Miel", 10, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.LACTOSE_FREE, new Timestamp(300),
				List.of(
					new Step("Mixer les ingrédients", "Mixer tous les ingrédients jusqu'à obtenir un smoothie homogène.")
				),
				5, 40, 5, 200
			),

			// Nouvelle recette 3 : Wraps au poulet et avocat
			new Recipe("Wraps au poulet et avocat",
				List.of(
					new Ingredient("Tortillas de blé", 2, QuantityType.PART, Allergen.WHEAT),
					new Ingredient("Poulet", 150, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Avocat", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Salade", 50, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.OMNIVORE, new Timestamp(900),
				List.of(
					new Step("Préparer les wraps", "Cuire le poulet, couper les légumes, et assembler les wraps.")
				),
				20, 45, 25, 450
			),

			// Nouvelle recette 4 : Pancakes sans gluten
			new Recipe("Pancakes sans gluten",
				List.of(
					new Ingredient("Farine sans gluten", 100, QuantityType.GRAM, Allergen.GLUTEN),
					new Ingredient("Lait d'amande", 200, QuantityType.MILLILITER, Allergen.TREE_NUTS),
					new Ingredient("Oeuf", 1, QuantityType.PART, Allergen.EGGS),
					new Ingredient("Sirop d'érable", 20, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.GLUTEN_FREE, new Timestamp(1200),
				List.of(
					new Step("Préparer la pâte", "Mélanger la farine, le lait et l'œuf pour faire la pâte."),
					new Step("Cuire les pancakes", "Verser la pâte dans une poêle chaude et cuire chaque côté.")
				),
				10, 40, 8, 350
			),

			// Nouvelle recette 5 : Chili sin carne
			new Recipe("Chili sin carne",
				List.of(
					new Ingredient("Haricots rouges", 200, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Tomate", 3, QuantityType.PART, Allergen.NONE),
					new Ingredient("Maïs", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Épices chili", 5, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(2400),
				List.of(
					new Step("Préparer le chili", "Faire mijoter les haricots, les tomates et le maïs avec les épices.")
				),
				10, 60, 15, 400
			),

			// Nouvelle recette 6 : Saumon grillé à l'aneth
			new Recipe("Saumon grillé à l'aneth",
				List.of(
					new Ingredient("Saumon", 200, QuantityType.GRAM, Allergen.FISH),
					new Ingredient("Aneth", 5, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Citron", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Huile d'olive", 10, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.OMNIVORE, new Timestamp(1200),
				List.of(
					new Step("Griller le saumon", "Faire griller le saumon avec de l'huile d'olive et de l'aneth."),
					new Step("Servir", "Ajouter un filet de citron avant de servir.")
				),
				25, 5, 30, 350
			),

			// Nouvelle recette 7 : Burger végétarien au pois chiches
			new Recipe("Burger végétarien au pois chiches",
				List.of(
					new Ingredient("Pois chiches", 150, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Pain burger", 2, QuantityType.PART, Allergen.WHEAT),
					new Ingredient("Tomate", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Salade", 50, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.VEGETARIAN, new Timestamp(1800),
				List.of(
					new Step("Préparer le steak de pois chiches", "Mixer les pois chiches et former un steak."),
					new Step("Assembler le burger", "Griller le pain et assembler les ingrédients.")
				),
				12, 50, 18, 400
			),

			// Nouvelle recette 8 : Gaufres à la farine de coco
			new Recipe("Gaufres à la farine de coco",
				List.of(
					new Ingredient("Farine de coco", 100, QuantityType.GRAM, Allergen.TREE_NUTS),
					new Ingredient("Lait de coco", 200, QuantityType.MILLILITER, Allergen.NONE),
					new Ingredient("Oeuf", 2, QuantityType.PART, Allergen.EGGS),
					new Ingredient("Sucre", 20, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.LACTOSE_FREE, new Timestamp(1800),
				List.of(
					new Step("Préparer la pâte", "Mélanger tous les ingrédients pour faire la pâte à gaufres."),
					new Step("Cuire les gaufres", "Verser la pâte dans un gaufrier et cuire jusqu'à dorure.")
				),
				15, 60, 10, 450
			),

			// Nouvelle recette 9 : Pizza végétarienne sans gluten
			new Recipe("Pizza végétarienne sans gluten",
				List.of(
					new Ingredient("Pâte à pizza sans gluten", 1, QuantityType.PART, Allergen.GLUTEN),
					new Ingredient("Tomate", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Mozzarella", 100, QuantityType.GRAM, Allergen.DAIRY),
					new Ingredient("Basilic", 5, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.GLUTEN_FREE, new Timestamp(2400),
				List.of(
					new Step("Préparer la pizza", "Étaler la pâte, ajouter les ingrédients, et cuire au four.")
				),
				20, 70, 15, 550
			),

			// Nouvelle recette 10 : Taboulé au quinoa
			new Recipe("Taboulé au quinoa",
				List.of(
					new Ingredient("Quinoa", 150, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Concombre", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Tomate", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Menthe", 5, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(1200),
				List.of(
					new Step("Préparer le taboulé", "Faire cuire le quinoa et mélanger avec les légumes et la menthe.")
				),
				5, 60, 10, 350
			),

		// Nouvelle recette 12 : Salade de quinoa et avocat
		new Recipe("Salade de quinoa et avocat",
			List.of(
				new Ingredient("Quinoa", 150, QuantityType.GRAM, Allergen.NONE),
				new Ingredient("Avocat", 1, QuantityType.PART, Allergen.NONE),
				new Ingredient("Concombre", 1, QuantityType.PART, Allergen.NONE),
				new Ingredient("Citron", 1, QuantityType.PART, Allergen.NONE)
			),
			Diet.VEGAN, new Timestamp(600),
			List.of(
				new Step("Cuire le quinoa", "Cuire le quinoa dans de l'eau bouillante."),
				new Step("Assembler la salade", "Mélanger le quinoa, l'avocat et le concombre, puis ajouter du citron.")
			),
			10, 40, 10, 300
		),

			// Nouvelle recette 13 : Soupe miso
			new Recipe("Soupe miso",
				List.of(
					new Ingredient("Miso", 50, QuantityType.GRAM, Allergen.SOY),
					new Ingredient("Algues", 10, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Tofu", 100, QuantityType.GRAM, Allergen.SOY),
					new Ingredient("Oignon vert", 1, QuantityType.PART, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(600),
				List.of(
					new Step("Préparer la soupe", "Faire bouillir de l'eau et y dissoudre le miso."),
					new Step("Ajouter les ingrédients", "Ajouter le tofu, les algues et l'oignon vert.")
				),
				5, 10, 20, 150
			),

			// Nouvelle recette 14 : Omelette aux champignons
			new Recipe("Omelette aux champignons",
				List.of(
					new Ingredient("Oeufs", 3, QuantityType.PART, Allergen.EGGS),
					new Ingredient("Champignons", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Fromage râpé", 50, QuantityType.GRAM, Allergen.DAIRY),
					new Ingredient("Beurre", 10, QuantityType.GRAM, Allergen.DAIRY)
				),
				Diet.VEGETARIAN, new Timestamp(600),
				List.of(
					new Step("Préparer l'omelette", "Battre les œufs et les faire cuire avec les champignons et le fromage.")
				),
				25, 5, 20, 350
			),

			// Nouvelle recette 15 : Salade César au poulet
			new Recipe("Salade César au poulet",
				List.of(
					new Ingredient("Poulet", 150, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Salade romaine", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Croutons", 50, QuantityType.GRAM, Allergen.WHEAT),
					new Ingredient("Parmesan", 30, QuantityType.GRAM, Allergen.DAIRY)
				),
				Diet.OMNIVORE, new Timestamp(900),
				List.of(
					new Step("Préparer la salade", "Cuire le poulet et assembler la salade avec les croutons et le parmesan.")
				),
				30, 20, 35, 450
			),

			// Nouvelle recette 16 : Curry de légumes
			new Recipe("Curry de légumes",
				List.of(
					new Ingredient("Carottes", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Courgettes", 2, QuantityType.PART, Allergen.NONE),
					new Ingredient("Lait de coco", 200, QuantityType.MILLILITER, Allergen.NONE),
					new Ingredient("Pâte de curry", 10, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(1200),
				List.of(
					new Step("Préparer le curry", "Faire cuire les légumes dans la pâte de curry et le lait de coco.")
				),
				20, 40, 10, 300
			),

			// Nouvelle recette 17 : Gâteau au chocolat sans gluten
			new Recipe("Gâteau au chocolat sans gluten",
				List.of(
					new Ingredient("Farine sans gluten", 150, QuantityType.GRAM, Allergen.GLUTEN),
					new Ingredient("Chocolat noir", 100, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Oeufs", 3, QuantityType.PART, Allergen.EGGS),
					new Ingredient("Beurre", 50, QuantityType.GRAM, Allergen.DAIRY)
				),
				Diet.GLUTEN_FREE, new Timestamp(1800),
				List.of(
					new Step("Préparer le gâteau", "Mélanger les ingrédients et cuire au four.")
				),
				40, 60, 15, 500
			),

			// Nouvelle recette 18 : Pâtes au pesto
			new Recipe("Pâtes au pesto",
				List.of(
					new Ingredient("Pâtes", 150, QuantityType.GRAM, Allergen.WHEAT),
					new Ingredient("Pesto", 50, QuantityType.GRAM, Allergen.TREE_NUTS),
					new Ingredient("Parmesan", 30, QuantityType.GRAM, Allergen.DAIRY),
					new Ingredient("Huile d'olive", 10, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.VEGETARIAN, new Timestamp(900),
				List.of(
					new Step("Cuire les pâtes", "Cuire les pâtes et mélanger avec le pesto et le parmesan.")
				),
				30, 50, 15, 450
			),

			// Nouvelle recette 19 : Boulettes de lentilles
			new Recipe("Boulettes de lentilles",
				List.of(
					new Ingredient("Lentilles", 200, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Oignons", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Ail", 1, QuantityType.PART, Allergen.NONE),
					new Ingredient("Huile d'olive", 10, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.VEGAN, new Timestamp(1800),
				List.of(
					new Step("Préparer les boulettes", "Mixer les lentilles et les légumes et former des boulettes."),
					new Step("Cuire les boulettes", "Faire cuire les boulettes dans une poêle avec de l'huile d'olive.")
				),
				10, 40, 20, 300
			),

			// Nouvelle recette 20 : Tarte aux pommes sans lactose
			new Recipe("Tarte aux pommes sans lactose",
				List.of(
					new Ingredient("Pâte brisée sans lactose", 1, QuantityType.PART, Allergen.WHEAT),
					new Ingredient("Pommes", 3, QuantityType.PART, Allergen.NONE),
					new Ingredient("Sucre", 50, QuantityType.GRAM, Allergen.NONE),
					new Ingredient("Cannelle", 5, QuantityType.GRAM, Allergen.NONE)
				),
				Diet.LACTOSE_FREE, new Timestamp(2400),
				List.of(
					new Step("Préparer la tarte", "Étaler la pâte, ajouter les pommes et le sucre, puis cuire au four.")
				),
				15, 70, 5, 400)
		);
	}
}
