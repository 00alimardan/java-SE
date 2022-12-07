package HappyFamily;

import java.util.Set;

public class DomesticCat extends Pet implements PetsFoul {
    public void respond(){
        System.out.println("Meow, meow...");
    }

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    public DomesticCat() {
    }
}
