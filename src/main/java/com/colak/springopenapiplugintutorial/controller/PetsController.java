package com.colak.springopenapiplugintutorial.controller;

import com.example.petstore.api.PetsApi;
import com.example.petstore.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetsController implements PetsApi {

    @Override
    public ResponseEntity<Void> createPets(Pet pet) {
        return PetsApi.super.createPets(pet);
    }

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        return PetsApi.super.listPets(limit);
    }

    @Override
    public ResponseEntity<Pet> showPetById(String petId) {
        return PetsApi.super.showPetById(petId);
    }
}
