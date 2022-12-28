package lesson27.smallapp.repository;


import lesson27.smallapp.model.Person;

public interface PersonRepository extends UniversalRepository<Person, Long> {

    Long findMaxId();
}
