package HappyFamily;

import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private Map<DayOfWeek,String> schedule;

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

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.printf("Hello,%s\n",family.getPet());
    }

    public int setYear(int year){
        if (year>=0)
            return year;

        else return -1;
    }

    public  int setIq(int iq){
        if (iq>=0)
            return iq;

        else return -1;
    }

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year='" + year + '\'' +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running for Human...");
    }

}
