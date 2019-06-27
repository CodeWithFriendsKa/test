package de.medavis.MyGraphQl.contract;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContractRepo extends CrudRepository<Contract, Long> {
    @Override
    List<Contract> findAll();
}
