package Syllabus31.SmallApp;

public class Person {
    private float id;
    private String name;
    private String surname;
    private String father;
    private int age;
    private Gender gender;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(float id, String name, String surname, String father, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.father = father;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", father='" + father + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
