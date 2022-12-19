package guru.springframework.repositories;

import guru.springframework.petclinic.data.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long>{
}
