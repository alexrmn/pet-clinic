package guru.springframework.petclinic.data.services;

import guru.springframework.petclinic.data.model.Owner;
import guru.springframework.petclinic.data.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
