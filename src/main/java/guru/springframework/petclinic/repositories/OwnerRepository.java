package guru.springframework.petclinic.repositories;

import guru.springframework.petclinic.data.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
