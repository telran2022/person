package telran.java2022.person.dao;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
