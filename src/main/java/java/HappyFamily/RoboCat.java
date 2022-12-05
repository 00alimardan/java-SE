package java.HappyFamily;

import java.util.Set;

public class RoboCat extends Pet implements PetsFoul{
    public void respond(){
        System.out.println("I am dangerous");
    }

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    public RoboCat() {
    }
}
