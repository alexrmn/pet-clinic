package guru.springframework.petclinic.data.services.springdatajpa;

import guru.springframework.petclinic.data.model.PetType;
import guru.springframework.petclinic.data.model.Vet;
import guru.springframework.petclinic.data.services.PetTypeService;
import guru.springframework.repositories.PetRepository;
import guru.springframework.repositories.PetTypeRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;

    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
