package java.HappyFamily;

public class Main {
    public static void main(String[] args) {
        Human mother=new Human("Jennifer","Lopez");
        Human father=new Human("Brad","Pitt");
        Human children=new Human("Kevin","McCallister");
        Pet pet=new Pet(Species.DOG,"Spike",5,39,new String[]{"sleep"});


        Family family=new Family(mother,father);
        family.addChild(children);
        family.setPet(pet);
        System.out.println(family);




        String[][] Schedule=new String[][]{{DayOfWeek.MONDAY.name(),"Sleep"},
                                           {DayOfWeek.THURSDAY.name(),"Arrive at university"}};

        Human human=new Human("Ali","Aliyev",2004,57,Schedule);
        System.out.println(human);





//        for (int i=0;i<1_000_000;i++) {
//            new Human();
//        }
    }
}
