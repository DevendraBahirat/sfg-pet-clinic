package com.udemy.tutorial.sfgpetclinic.services;

import com.udemy.tutorial.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
