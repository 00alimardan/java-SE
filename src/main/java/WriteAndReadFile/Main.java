package WriteAndReadFile;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/PeopleData.txt");

        Person person = new Person("Alimardan", "Alimardanov");

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);

        //Write to file
        try (FileWriter writer = new FileWriter(file)) {

            writer.write(String.valueOf(people));
        }

        //Read from file
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}