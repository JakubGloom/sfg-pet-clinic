package com.gluma.sfgpetclinic.services;

import com.gluma.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet finById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
