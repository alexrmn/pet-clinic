package guru.springframework.petclinic.data.services;

import guru.springframework.petclinic.data.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService <Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLikeIgnoreCase(String lastName);


}
