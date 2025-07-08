package com.example.Receipe_Manager.repository;

import com.example.Receipe_Manager.model.Receipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReceipeRepository extends MongoRepository<Receipe,String> {
}
