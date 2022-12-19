package Syllabus31.Exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static final List<Person> people=new ArrayList<>(15);

    public static void run() throws Exception {
        System.out.println();
        Person father=new Person("Peter","McCallister");
        Person mother=new Person("Kate","McCallister");
        Person child=new Person("Kevin","McCallister",8, Gender.MALE,father,mother);
        addPeople();

//        System.out.println("Sorted by name: ");
//        sortByName();
//        System.out.println("========================================");
//
//        System.out.println("Sorted by surname: ");
//        sortBySurname();
//        System.out.println("========================================");
//
//        System.out.println("Sorted by age: ");
//        sortByAge();
//        System.out.println("========================================");
//
//        System.out.println(child);

        writeToFile();
        readFromFile();
    }

    private static void addPeople(){
        people.add(new Person("ChildName12","ChildSurname12",12, Gender.FEMALE,
                new Person("FatherName12","FatherSurname12"), new Person("MotherName12","MotherSurname12")));

        people.add(new Person("ChildName11","ChildSurname11",11, Gender.MALE,
                new Person("FatherName11","FatherSurname11"), new Person("MotherName11","MotherSurname11")));

        people.add(new Person("ChildName1","ChildSurname1",1, Gender.MALE,
                new Person("FatherName1","FatherSurname1"), new Person("MotherName1","MotherSurname1")));

        people.add(new Person("ChildName10","ChildSurname10",10, Gender.MALE,
                new Person("FatherName10","FatherSurname10"), new Person("MotherName10","MotherSurname10")));

        people.add(new Person("ChildName5","ChildSurname5",5, Gender.MALE,
                new Person("FatherName5","FatherSurname5"), new Person("MotherName5","MotherSurname5")));

        people.add(new Person("ChildName3","ChildSurname3",3, Gender.MALE,
                new Person("FatherName3","FatherSurname3"), new Person("MotherName3","MotherSurname3")));

        people.add(new Person("ChildName2","ChildSurname2",2, Gender.MALE,
                new Person("FatherName2","FatherSurname2"), new Person("MotherName2","MotherSurname2")));

        people.add(new Person("ChildName13","ChildSurname13",13, Gender.MALE,
                new Person("FatherName13","FatherSurname13"), new Person("MotherName13","MotherSurname13")));

        people.add(new Person("ChildName15","ChildSurname15",15, Gender.FEMALE,
                new Person("FatherName15","FatherSurname15"), new Person("MotherName15","MotherSurname15")));

        people.add(new Person("ChildName14","ChildSurname14",14, Gender.MALE,
                new Person("FatherName14","FatherSurname14"), new Person("MotherNam14","MotherSurname14")));

        people.add(new Person("ChildName4","ChildSurname4",4, Gender.MALE,
                new Person("FatherName4","FatherSurname4"), new Person("MotherName4","MotherSurname4")));

        people.add(new Person("ChildName6","ChildSurname6",6, Gender.FEMALE,
                new Person("FatherName6","FatherSurname6"), new Person("MotherName6","MotherSurname6")));

        people.add(new Person("ChildName7","ChildSurname7",7, Gender.MALE,
                new Person("FatherName7","FatherSurname7"), new Person("MotherName7","MotherSurname7")));

        people.add(new Person("ChildName9","ChildSurname9",9, Gender.MALE,
                new Person("FatherName9","FatherSurname9"), new Person("MotherName9","MotherSurname9")));

        people.add(new Person("ChildName8","ChildSurname8",8, Gender.FEMALE,
                new Person("FatherName8","FatherSurname8"), new Person("MotherName8","MotherSurname8")));
    }

    public static void sortByName(){
        people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }

    public static void sortBySurname(){
        people.stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .forEach(System.out::println);
    }

    public static void sortByAge(){
        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
    }

    public static void peopleAgeAverage(){
        people.stream()
                .mapToDouble(Person::getAge)
                .average()
                .orElse(0);
    }

    public static void writeToFile() throws IOException, RuntimeException{
        File file = new File("src/main/resources/PeopleData.txt");
        try (FileWriter writer = new FileWriter(file)) {

            writer.write(String.valueOf(people));
        }
    }

    public static void readFromFile() throws Exception {
        File file = new File("src/main/resources/PeopleData.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
//https://samderlust.com/dev-blog/java/write-read-arraylist-object-file-java