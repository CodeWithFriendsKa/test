package de.medavis.MyGraphQl.person;

import de.medavis.MyGraphQl.contract.Contract;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Contract> contracts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.contracts = new ArrayList<>();
    }

    public Person(String name, int age, List<Contract> contracts) {
        this.name = name;
        this.age = age;
        this.contracts = contracts;
    }
}
