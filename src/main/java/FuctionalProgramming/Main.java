package FuctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people=List.of(
                new Person("Ali", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
                );

        List<Person> femalePersons=new ArrayList<>();
        for (Person females:people) {
            if (Gender.FEMALE.equals(females.gender)){
                femalePersons.add(females);
                System.out.println(females);
            }
        }
        System.out.println("Different way: ");
         people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Different way2: ");
        Predicate<Person> personPredicate=person -> Gender.FEMALE.equals(person.gender);
        List<Person> females=people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females.forEach(System.out::println);


    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE
    }
}

