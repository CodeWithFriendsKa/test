package de.medavis.MyGraphQl.contract;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Contract {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int amount;

    public Contract(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}
