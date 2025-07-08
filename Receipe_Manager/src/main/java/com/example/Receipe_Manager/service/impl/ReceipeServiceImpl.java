package com.example.Receipe_Manager.service.impl;

import com.example.Receipe_Manager.dto.ReceipeDto;
import com.example.Receipe_Manager.model.Receipe;
import com.example.Receipe_Manager.repository.ReceipeRepository;
import com.example.Receipe_Manager.service.ReceipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class ReceipeServiceImpl implements ReceipeService {
    @Autowired
    private ReceipeRepository receipeRepository;

    @Override
    public String addRecipe(ReceipeDto receipeDto) {
        Receipe receipe=new Receipe();
        receipe.setNameOfReceipe(receipeDto.getNameOfReceipe());
        receipe.setIngredients(receipeDto.getIngredients());
        receipe.setSteps(receipeDto.getSteps());
        receipe.setCookingTime(receipeDto.getCookingTime());
        receipeRepository.save(receipe);
        return receipe.getNameOfReceipe()+" added successfully";
    }

    @Override
    public ReceipeDto searchReceipe(String nameOfReceipe) {
        Optional<Receipe> receipe=receipeRepository.findById(nameOfReceipe);
        ReceipeDto receipeDto=new ReceipeDto();
        if(receipe.isPresent())
        {
            Receipe receipe1=receipe.get();
            receipeDto.setNameOfReceipe(receipe1.getNameOfReceipe());
            receipeDto.setIngredients(receipe1.getIngredients());
            receipeDto.setSteps(receipe1.getSteps());
            receipeDto.setCookingTime(receipe1.getCookingTime());
        }
        return receipeDto;
    }

    @Override
    public String updateRecipe(ReceipeDto receipeDto) {
        Optional<Receipe> receipe=receipeRepository.findById(receipeDto.getNameOfReceipe());
        if(receipe.isPresent())
        {
            Receipe updatedRecipe=receipe.get();
            updatedRecipe.setCookingTime(receipeDto.getCookingTime());
            updatedRecipe.setIngredients(receipeDto.getIngredients());
            updatedRecipe.setSteps(receipeDto.getSteps());
            receipeRepository.save(updatedRecipe);
            return updatedRecipe.getNameOfReceipe()+" updated succesfully";
        }
        else {
            return receipeDto.getNameOfReceipe()+" not found";
        }


    }

    @Override
    public void deleteReceipe(String nameOfReceipe) {
        receipeRepository.deleteById(nameOfReceipe);

    }
}
