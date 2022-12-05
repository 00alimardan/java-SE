package java.HappyFamily;

import java.util.Set;

public class Dog extends Pet implements PetsFoul{
    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Dog() {
    }

    public void respond(){

        System.out.println("Bark, bark...");


    }
}
