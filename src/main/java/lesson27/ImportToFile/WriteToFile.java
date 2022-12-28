package lesson27.ImportToFile;

import lesson27.smallapp.model.User;
import lesson27.smallapp.service.UserService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile  {
    public static void importToFile() throws IOException, RuntimeException {
        File file=new File("src/main/resources/UsersData.txt");
        try(FileWriter writer=new FileWriter(file)) {
            for (User userData:UserService.userRepo.getAll()){
                writer.write(String.valueOf(userData).concat("\n \n"));
            }
        }
    }
    public static void saveInFile() throws Exception{
        System.out.print("Do you want to save your data in file?: choose 'yes' or 'no'...");
        Scanner scr=new Scanner(System.in);
        String choice= scr.nextLine();
        switch (choice.toLowerCase()){
            case "yes":
                importToFile();
            case "no":
                break;
        }
    }
}
