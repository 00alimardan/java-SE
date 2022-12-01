package java.Syllabus9;

public class Human {
    public String name;
    public String surname;
    public String year;
    public byte IQ;
    public String pet;
    public String mother;
    public String father;
    public String schedule;
    public String greetPet;
    public String describePet;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year='" + year + '\'' +
                ", IQ=" + IQ +
                ", pet='" + pet + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", schedule='" + schedule + '\'' +
                '}'+"\n"+"\n"+"Human"+"\n" +
                greetPet+"\n"+describePet;
    }
}
