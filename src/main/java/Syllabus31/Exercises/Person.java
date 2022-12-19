package Syllabus31.Exercises;

public class Person extends Human implements Ability {
    private Person father;
    private Person mother;

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }


    @Override
    public void write(String word) {
        System.out.println(word);
    }

    @Override
    public void read(String word) {
        System.out.println(word);
    }

    @Override
    public void sing(String word) {
        System.out.println(word);
    }

    @Override
    public void dance(String word) {
        System.out.println(word);
    }

    @Override
    public void run(String word) {
        System.out.println(word);
    }


    public Person(String name, String surname) {
        super(name, surname);
    }

    public Person(String name, String surname, int age, Gender gender, Person father, Person mother) {
        super(name, surname, age, gender);
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Person[" +
                "father=" + "{name:"+ father.getName() +", surname:"+ father.getSurname()+"}" +
                ", mother=" + "{name:"+ mother.getName() +", surname:"+ mother.getSurname()+"}" +
                ", child=" + "{name:"+ getName()+", surname:"+getSurname()+", age:"+getAge()+", gender:"+getGender()+"}"  +
                ']';
    }
}
