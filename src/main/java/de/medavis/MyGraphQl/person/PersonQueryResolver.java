package de.medavis.MyGraphQl.person;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonQueryResolver implements GraphQLQueryResolver {

    private final PersonRepo repo;

    public List<Person> persons(){
        return repo.findAll();
    }

    public Person personById(Long id){
        return repo.findById(id).get();
    }
}
