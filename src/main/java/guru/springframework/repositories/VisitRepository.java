package guru.springframework.repositories;

import guru.springframework.petclinic.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository <Visit, Long> {
}
