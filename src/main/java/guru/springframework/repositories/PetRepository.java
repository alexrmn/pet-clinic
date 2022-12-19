package guru.springframework.repositories;

import guru.springframework.petclinic.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
