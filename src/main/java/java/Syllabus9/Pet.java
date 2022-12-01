package java.Syllabus9;

public class Pet {

    public String species;
    public String nickname;
    public byte age;
    public byte trickLevel;
    public String habits;
    public String eat;
    public String respond;
    public String foul;

    public void positive(byte age, byte trickLevel) {
        if (age < 0)
            System.out.println("Please enter a positive number");
        else this.age = age;

        if (trickLevel < 0)
            System.out.println("Please enter a positive number");
        else this.trickLevel = trickLevel;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "specie='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel= " + trickLevel +"/100"+
                ", habits='" + habits + '\'' +
                '}'+"\n"+"\n"+"Pet" + "\n"+
                eat+"\n"+
                respond+"\n"+
                foul;
    }
}










