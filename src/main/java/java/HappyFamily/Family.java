package java.HappyFamily;

import java.util.ArrayList;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Set<Pet> pet;
    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }
//******************************************************************************
    public Family(Human mother, Human father, ArrayList<Human> children, Set<Pet> pet, Family family) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        this.family = family;
    }
    public Family(Human mother, Human father, ArrayList<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
    }
//******************************************************************************

//******************************************************************************
    public void addChild(Human child){
        children.add(child);

    }
//    -----------------------------------------------------
    public boolean deleteChild(Human child){
        if (children.contains(child)){
            children.remove(child);
            return false;
        }

        else{
            return  false;
        }
    }
    //    -----------------------------------------------------
    public boolean deleteChild(int n){
        if (children.size()==0){
            return false;
        }
        else {
            children.remove(n);
            return true;
        }
    }
//******************************************************************************
    public int countFamily(){
        int count=2;
        count=children.size();
        if (pet!=null)
            count+=1;
        return count;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                ", family=" + family +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running for Family...");
    }
}

