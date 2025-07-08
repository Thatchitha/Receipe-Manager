package com.example.Receipe_Manager.controller;

import com.example.Receipe_Manager.dto.ReceipeDto;
import com.example.Receipe_Manager.service.ReceipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receipes")
@CrossOrigin("*")
public class ReceipeController {
    @Autowired
    private ReceipeService receipeService;
    @PostMapping("/add")
    public String addReceipes(@RequestBody ReceipeDto receipeDto)
    {
        return receipeService.addRecipe(receipeDto);
    }
    @GetMapping("/search")
    public ReceipeDto searchReceipe(@RequestParam("nameOfReceipe") String nameOfReceipe)
    {
        return receipeService.searchReceipe(nameOfReceipe);
    }
    @PutMapping("/update")
    public String update(@RequestBody ReceipeDto receipeDto)
    {
        return receipeService.updateRecipe(receipeDto);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam("nameOfReceipe") String nameOfReceipe)
    {
        receipeService.deleteReceipe(nameOfReceipe);

    }
}
