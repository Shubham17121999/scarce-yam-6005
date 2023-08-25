package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


class RecipeManagementSystem {
	 private List<User> users;
	 private List<Recipe> recipes;
	 private User loggedInUser;
	 
	 public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public User getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(User loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public RecipeManagementSystem() {
	     users = new ArrayList<>();
	     recipes = new ArrayList<>();
	     // Add initial recipes and users if needed
	 }
	 
	 public void registerUser(String username, String password) {
	     User newUser = new User(username, password);
	     users.add(newUser);
	 }
	 
	 public void loginUser(String username, String password) {
	     for (User user : users) {
	         if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
	             loggedInUser = user;
	             break;
	         }
	     }
	 }
	 
	 
		 public void displayRecipeInfo(String recipeName) {
		        for (Recipe recipe : recipes) {
		            if (recipe.getName().equals(recipeName)) {
		                System.out.println("Recipe: " + recipe.getName());
		                System.out.println("Ingredients:");
		                for (String ingredient : recipe.getIngredients()) {
		                    System.out.println("- " + ingredient);
		                }
		                System.out.println("Preparation Steps:");
		                for (int i = 0; i < recipe.getPreparationSteps().size(); i++) {
		                    System.out.println((i + 1) + ". " + recipe.getPreparationSteps().get(i));
		                }
		                System.out.println("Likes: " + recipe.getLikes());
		                break;
		            }
		        }
		    }

		public void viewRecipes() {
			// TODO Auto-generated method stub
			
		}

		public void likeRecipe(String string) {
			// TODO Auto-generated method stub
			
		}

		public void addRecipe(String string, List<String> asList, List<String> asList2) {
			// TODO Auto-generated method stub
			
		}

		public Admin LoggedInUser() {
//			if (loggedInUser instanceof Admin) {
//	            return (Admin) loggedInUser;
//	        } else {
	            return null; // Return null if the logged-in user is not an admin
//	        }
		}

		
	 
	 
	 // Other methods for filtering, liking recipes, etc.
	}