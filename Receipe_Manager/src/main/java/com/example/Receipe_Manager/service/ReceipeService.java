package com.example.Receipe_Manager.service;

import com.example.Receipe_Manager.dto.ReceipeDto;

public interface ReceipeService {
    public String addRecipe(ReceipeDto receipeDto);
    public ReceipeDto searchReceipe(String nameOfReceipe);
    public String updateRecipe(ReceipeDto receipeDto);
    public void deleteReceipe(String nameOfReceipe);
}
