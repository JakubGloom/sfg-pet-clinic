package com.gluma.sfgpetclinic.services;

import com.gluma.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet finById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
