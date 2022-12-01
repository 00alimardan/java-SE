package java.Syllabus9;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<<<<<<>>>>>");

        Pet a=new Pet();
        a.species="cat";
        a.nickname="Garfield";
        a.age=5;
        a.trickLevel=83;
        a.habits="sleep";

        a.eat="I am eating";
        a.respond="Hello, owner. I am Garfield. I miss you!";
        a.foul="I need to cover it up";

        System.out.println(a);
        System.out.println("***********************");


        Human c=new Human();
        c.name="Alimardan";
        c.surname="Alimardanov";
        c.year="08.05.2004";
        c.IQ=90;
        c.pet="dog";
        c.mother="Aynur";
        c.father="Mardan";
        c.schedule="";

        c.greetPet="Hello, Spike";
        c.describePet="I have a dog, he is 3 years old";

        System.out.println(c);
        System.out.println("***********************");

    }
}
