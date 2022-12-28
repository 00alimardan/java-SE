package lesson27.smallapp.AppAndMain;

import lesson27.ImportToFile.WriteToFile;
import lesson27.smallapp.model.Commands;
import lesson27.smallapp.model.Person;
import lesson27.smallapp.model.User;
import lesson27.smallapp.service.PersonService;
import lesson27.smallapp.service.UserService;

import static lesson27.smallapp.util.ScannerUtil.*;

public class Application {

    private static final PersonService personService = new PersonService();
    private static final UserService userService = new UserService();

    public static void run() throws Exception {
        boolean flag = true;

        while (flag) {
            showCommands();
            Commands cmd = getCommand();

            switch (cmd) {
                case SP:
                    Person person = getPersonData();
                    personService.savePerson(person);
                    break;
                case RU:
                    User user = getUserData();
                    Long personId = getPersonId();
                    userService.registerUser(user, personId);
                    break;
                case SHP:
                    personService.showPeople();
                    break;
                case SU:
                    userService.showUser();
                    break;
                case EXIT:
                    flag = false;
            }
        }
        WriteToFile.saveInFile();
    }
    private static void showCommands() {
        System.out.print("Commands: \n" +
                "1. (sp)   - " + Commands.SP.getDescription() + "\n" +
                "2. (ru)   - " + Commands.RU.getDescription() + "\n" +
                "3. (shp)  - " + Commands.SHP.getDescription() + "\n" +
                "4. (su)   - " + Commands.SU.getDescription() + "\n" +
                "5. (exit) - " + Commands.EXIT.getDescription() + "\n" +
                "Enter command: ");
    }
}
