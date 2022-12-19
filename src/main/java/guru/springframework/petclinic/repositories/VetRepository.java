package guru.springframework.petclinic.repositories;

import guru.springframework.petclinic.data.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
