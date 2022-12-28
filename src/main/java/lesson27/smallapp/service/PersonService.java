package lesson27.smallapp.service;


import lesson27.smallapp.model.Person;
import lesson27.smallapp.repository.PersonRepository;
import lesson27.smallapp.repository.impl.PersonRepoCollectionImpl;

import java.util.Formatter;

public class PersonService {

    private static final PersonRepository personRepository = new PersonRepoCollectionImpl();

    public void savePerson(Person person) {
        Long nextId = personRepository.findMaxId() + 1;
        person.setId(nextId);

        personRepository.save(person);
        System.out.println();
    }

    public void showPeople() {
//        System.out.println();
//        personRepository.getAll().forEach(System.out::println);
        System.out.println();

        Formatter fmt=new Formatter();
        fmt.format("%5s  |  %5s      |  %5s     |  %5s  |  %5s     |  %5s  |\n","PersonID","Name","Surname","Father name","Age","Gender");
        fmt.format("--------------------------------------------------------------------------------------------------\n");
        for (Person p: personRepository.getAll()){
            fmt.format("%11s %13s %14s %15s %12s %10s\n", "|", "|", "|", "|", "|", "|");
            fmt.format("%4s %17s %14s %16s %10s %12s\n",p.getId(),p.getName(),p.getSurname(),p.getFatherName(),p.getAge(),p.getGender());
            fmt.format("%11s %13s %14s %15s %12s %10s\n", "|", "|", "|", "|", "|", "|");
            fmt.format("--------------------------------------------------------------------------------------------------\n");
        }
        System.out.println(fmt);
    }
}
