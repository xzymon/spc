package com.xzymon.spc.services;

import com.xzymon.spc.model.Pet;

import java.util.Set;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
