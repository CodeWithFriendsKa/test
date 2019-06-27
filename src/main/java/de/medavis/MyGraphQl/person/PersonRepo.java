package de.medavis.MyGraphQl.person;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepo extends CrudRepository<Person, Long> {
    @Override
    List<Person> findAll();
}