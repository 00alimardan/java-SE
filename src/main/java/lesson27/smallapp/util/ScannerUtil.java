package lesson27.smallapp.util;

import lesson27.smallapp.model.Commands;
import lesson27.smallapp.model.Gender;
import lesson27.smallapp.model.Person;
import lesson27.smallapp.model.User;
import lesson27.smallapp.service.UserService;

import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static Commands getCommand() {
        return Commands.valueOf(sc.nextLine().toUpperCase());
    }

    public static Person getPersonData() {
        Person person = new Person();

        System.out.print("Enter name: \n");
        person.setName(sc.nextLine());

        System.out.print("Enter surname: \n");
        person.setSurname(sc.nextLine());

        System.out.print("Enter father name: \n");
        person.setFatherName(sc.nextLine());

        System.out.print("Enter age: \n");
        person.setAge(sc.nextInt());

        sc.nextLine();
        System.out.print("Enter gender: (MALE/FEMALE) \n");
        person.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

        return person;
    }

    public static User getUserData() {
        User user = new User();

        System.out.print("Enter Username: \n");
        user.setUsername(sc.nextLine());

        System.out.print("Enter password: \n");
        user.setPassword(sc.nextLine());

        return user;
    }

    public static Long getPersonId() {
        System.out.print("Enter Person ID: \n");
        Long id = sc.nextLong();
        sc.nextLine();
        return id;
    }

    public static void showUserPassword(){
        System.out.print("Do you want to see your password?: choose 'yes' or 'no'...");
        String input= sc.nextLine();
        switch (input.toLowerCase()) {
            case "yes":
                System.out.print("Enter your Username: ");
                String username=sc.nextLine();
                for (User psw : UserService.userRepo.getAll()) {
                    if (psw.getUsername().equals(username)) {
                        System.out.println(psw.getUsername() + "'s password is: " + psw.getPassword());
                    }
                    else System.out.println("Wrong Username!!!");
                }
                break;

            case "no":
                break;
        }
    }
}
