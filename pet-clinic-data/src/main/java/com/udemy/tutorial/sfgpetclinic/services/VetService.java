package com.udemy.tutorial.sfgpetclinic.services;

import com.udemy.tutorial.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
