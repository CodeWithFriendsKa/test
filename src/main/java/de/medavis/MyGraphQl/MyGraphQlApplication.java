package de.medavis.MyGraphQl;

import de.medavis.MyGraphQl.contract.Contract;
import de.medavis.MyGraphQl.person.Person;
import de.medavis.MyGraphQl.person.PersonRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class MyGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyGraphQlApplication.class, args);
	}

	@Bean
	public CommandLineRunner createDemoData(PersonRepo repo){
		return args -> {
			log.debug("Create demo person: {}", repo.save(
					new Person(
							"Luke Skywalker",
							19,
							Arrays.asList(
									new Contract("Haftpflichtversicherung", 1000000)
							)
					)
			));
			log.debug("Create demo person: {}", repo.save(
					new Person("Obi Wan", 50)
			));
			log.debug("Create demo person: {}", repo.save(
					new Person(
							"Yoda",
							912,
							Arrays.asList(
									new Contract("Haftpflichtversicherung", 1000000),
									new Contract("Private Rentenversicherung", 1000 )
							)
					)
			));
		};
	}
}
