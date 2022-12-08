package guru.springframework.petclinic.data.services;

import guru.springframework.petclinic.data.model.Owner;
import guru.springframework.petclinic.data.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
