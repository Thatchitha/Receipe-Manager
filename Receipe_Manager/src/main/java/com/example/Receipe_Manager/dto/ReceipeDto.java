package com.example.Receipe_Manager.dto;

import java.util.List;

public class ReceipeDto {
    private String nameOfReceipe;
    private List<String> ingredients;
    private List<String> steps;
    private String cookingTime;

    public ReceipeDto(String nameOfReceipe, List<String> ingredients, List<String> steps, String cookingTime) {
        this.nameOfReceipe = nameOfReceipe;
        this.ingredients = ingredients;
        this.steps = steps;
        this.cookingTime = cookingTime;
    }

    public ReceipeDto() {
    }

    public String getNameOfReceipe() {
        return nameOfReceipe;
    }

    public void setNameOfReceipe(String nameOfReceipe) {
        this.nameOfReceipe = nameOfReceipe;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }
}
