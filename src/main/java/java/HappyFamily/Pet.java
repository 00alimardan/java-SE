package java.HappyFamily;

import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat(){

        System.out.println("'I am eating'");
    }

    public void respond(){
        System.out.println("'Hello, owner. I am - [the name of the pet]. I miss you!'");
    }

    public static void foul(){
        System.out.println("'I need to cover it up'");
    }

    public int setAge(int age){
        if (age>1)
            return age;

        else return -1;
    }
    public int setTrickLevel(int trickLevel){
        if (trickLevel>=1 && trickLevel<=100)
            return trickLevel;

        else return -1;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        setSpecies(species);
        this.nickname = nickname;
        this.age = setAge(age);
        this.trickLevel = setTrickLevel(trickLevel);
        this.habits = habits;

    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running for Pet...");
    }
}
