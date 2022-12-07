package HappyFamily;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Human mother=new Human("Jennifer","Lopez");
        Human father=new Human("Brad","Pitt");
        Human children=new Human("Kevin","McCallister");


        Family family=new Family(mother,father);
        family.addChild(children);
        System.out.println(family);

        Map<DayOfWeek,String> Schedule=new HashMap<>();
        Schedule.put(DayOfWeek.MONDAY,"Sleep");
        Schedule.put(DayOfWeek.TUESDAY,"Arrive at university");

        Human human=new Human("Ali","Aliyev",2004,57,Schedule);
        System.out.println(human);
    }
}
