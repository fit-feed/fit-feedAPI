package com.fitfeed.feed.models.recipes;

import com.fitfeed.feed.models.Allergen;
import com.fitfeed.feed.models.Picture;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

	@ManyToOne
	private QuantityType quantityType;

	@ManyToMany
	private List<Allergen> allergens;

	@OneToOne
	private Picture picture;
}
