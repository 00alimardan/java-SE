package lesson27.smallapp.service;

import lesson27.smallapp.model.Person;
import lesson27.smallapp.model.User;
import lesson27.smallapp.repository.PersonRepository;
import lesson27.smallapp.repository.UserRepository;
import lesson27.smallapp.repository.impl.PersonRepoCollectionImpl;
import lesson27.smallapp.repository.impl.UserRepoCollectionImpl;
import lesson27.smallapp.util.ScannerUtil;

import java.util.Formatter;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserService {
    public static final UserRepository userRepo = new UserRepoCollectionImpl();
    private static final PersonRepository personRepo = new PersonRepoCollectionImpl();

    public void registerUser(User user, Long personId) {
        Long nextId = userRepo.findMaxId() + 1;
        user.setId(nextId);

//        checkUsername(user);
//        Person person = getPerson(personId);
//        user.setPerson(person);

        userRepo.save(user);
    }

    private Person getPerson(Long id) {
        return Optional.of(personRepo.getById(id))
                .orElseThrow(() -> new RuntimeException("PERSON ID NOT FOUND !!!"));
    }

    private void checkUsername(User user) {
        if (usernameContains(user.getUsername())) {
            throw new RuntimeException("USER ALREADY EXIST !!!");
        }
    }

    private boolean usernameContains(String username) {
        return userRepo.getAll()
                .stream()
                .map(User::getUsername)
                .collect(Collectors.toList())
                .contains(username);
    }
    public void showUser(){
        System.out.println();
        Formatter fmt=new Formatter();
        fmt.format("%s |  %s  |    %s        |\n","UserID","Username","   Password");
        fmt.format("----------------------------------------------\n");
        for (User u:userRepo.getAll()){
            fmt.format("%8s %12s %23s\n", "|", "|", "|");
            fmt.format("%s %17s %s\n",u.getId(),u.getUsername(),"    You can't see me:)");
            fmt.format("%8s %12s %23s\n", "|", "|", "|");
            fmt.format("----------------------------------------------\n");
        }
        System.out.println(fmt);
        ScannerUtil.showUserPassword();
    }
}
