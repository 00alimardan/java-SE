package HappyFamily;

import java.util.Set;

public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Fish() {
    }

    public void respond(){
        System.out.println("Fish doing Blob, blob...");

    }
}
