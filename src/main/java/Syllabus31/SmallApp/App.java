package Syllabus31.SmallApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
   public static final Scanner scr=new Scanner(System.in);
   public static final List<Person> person=new ArrayList<>();
    public static final List<User> user=new ArrayList<>();
    public static float id=0;
    public static void run(){
        boolean key=true;
        System.out.println("Commands: ");
        System.out.println("sp (Save Person)");
        System.out.println("ru (Register User)");
        System.out.println("shp (Show People)");
        System.out.println("exit");
    while (key){
        System.out.print("Enter any command: ");
        String choice=scr.nextLine();

        switch (choice.toLowerCase()) {

            case "sp":
                savePerson();
                break;

            case "ru":
                registerUser();
                break;

            case "shp":
                showPeople();
                break;

            case "exit":
                key=false;
                break;

            }
        }
    }

    public static void savePerson(){
        System.out.println("Enter Person's name: ");
        String name=scr.nextLine();
        System.out.println("Enter Person's surname: ");
        String surname=scr.nextLine();
        System.out.println("Enter Person's Father name");
        String father=scr.nextLine();
        System.out.println("Enter Person's age");
        int age=scr.nextInt();
        System.out.println("Enter Person's Gender: 1.MALE; 2.Female");
        int input=scr.nextInt();
        Gender gender=Gender.UNKNOWN;


        switch (input){
            case 1:
                gender=Gender.MALE;
                break;

            case 2:
                gender=Gender.FEMALE;
                break;

            default:
                break;
        }
        person.add(new Person(id,name,surname,father,age,gender));
    }
    public static void registerUser(){
        System.out.println("Enter Username: ");
        String username=scr.nextLine();
        System.out.println("Enter password: ");
        String password=scr.nextLine();

        boolean flag=true;
        for (User a:user) {
            if (a.getUsername().equals(username)){
                flag=false;
            }
        }
        if (flag){
            user.add(new User(id,username,password));
        }
    }

    public static void showPeople(){
        person.forEach(System.out::println);
        user.forEach(System.out::println);
        id= (float) (id+0.1);
    }
}
