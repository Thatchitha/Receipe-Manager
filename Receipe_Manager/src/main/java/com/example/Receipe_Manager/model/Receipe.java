package com.example.Receipe_Manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "receipesRecords")

public class Receipe {
    @Id
    private String nameOfReceipe;
    private List<String> ingredients;
    private List<String> steps;
    private String cookingTime;

    public Receipe(String nameOfReceipe, List<String> ingredients, List<String> steps, String cookingTime) {
        this.nameOfReceipe = nameOfReceipe;
        this.ingredients = ingredients;
        this.steps = steps;
        this.cookingTime = cookingTime;
    }

    public Receipe() {
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
