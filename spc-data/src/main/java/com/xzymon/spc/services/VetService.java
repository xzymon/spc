package com.xzymon.spc.services;

import com.xzymon.spc.model.Pet;
import com.xzymon.spc.model.Vet;

import java.util.Set;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
