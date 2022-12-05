package java.HappyFamily;

import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public void eat(){System.out.println("'I am eating'");}


    public abstract void respond();

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

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
//        if(species!=null){
//            setSpecies(species);
//        }
//        else {
//            setSpecies(Species.UNKNOWN);
//        }
        setSpecies(Species.UNKNOWN);
        this.nickname = nickname;
        this.age = setAge(age);
        this.trickLevel = setTrickLevel(trickLevel);
        this.habits = habits;

    }

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running for Pet...");
    }
}
