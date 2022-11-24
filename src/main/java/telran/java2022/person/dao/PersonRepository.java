package telran.java2022.person.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	List<Person> findByName(String name);

	List<Person> findByAddressCity(String city);

	List<Person> findByBirthDateBetween(LocalDate from, LocalDate to);

}
