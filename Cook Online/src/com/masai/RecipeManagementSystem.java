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
	 
	 public void viewRecipes() {
	     for (Recipe recipe : recipes) {
	         // Display recipe information
	     }
	 }
	 
	 // Other methods for filtering, liking recipes, etc.
	}