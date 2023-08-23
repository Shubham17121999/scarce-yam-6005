package com.masai;

import java.util.List;

class Recipe {
 private String name;
 private List<String> ingredients;
 private List<String> preparationSteps;
 private int likes;
 
 public Recipe(String name, List<String> ingredients, List<String> preparationSteps) {
     this.name = name;
     this.ingredients = ingredients;
     this.preparationSteps = preparationSteps;
     this.likes = 0;
 }
 
 public void addLike() {
     likes++;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<String> getIngredients() {
	return ingredients;
}

public void setIngredients(List<String> ingredients) {
	this.ingredients = ingredients;
}

public List<String> getPreparationSteps() {
	return preparationSteps;
}

public void setPreparationSteps(List<String> preparationSteps) {
	this.preparationSteps = preparationSteps;
}

public int getLikes() {
	return likes;
}

public void setLikes(int likes) {
	this.likes = likes;
}
 
 // Getter methods and other recipe-related functionality
}
