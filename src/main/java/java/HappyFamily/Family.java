package java.HappyFamily;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
//******************************************************************************
    public Family(Human mother, Human father, Human[] children, Pet pet, Family family) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        this.family = family;
    }
    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[]{};
    }
//******************************************************************************

//******************************************************************************
    public void addChild(Human child){
        if (children.length==0) {
            children = new Human[1];
            children[0] = child;
        }
        else {
            Human[] newChildrenArr=new Human[children.length+1];
            System.arraycopy(children,0,newChildrenArr,0,newChildrenArr.length);
            newChildrenArr[newChildrenArr.length-1]=child;
            children=newChildrenArr;
        }
    }
//    -----------------------------------------------------
    public boolean deleteChild(Human child){
        if (children.length==0){
            return false;
        }
        else if (!Arrays.stream(children).anyMatch(child::equals)){
            return false;
        }
        else{
            Human[] newChildrenArr =new Human[children.length-1];
            for (int i=0;i< children.length;i++){
                if (children[i]!= child){
                    newChildrenArr[i]=children[i];
                }
            }
            children=newChildrenArr;
            return  true;
        }
    }
    //    -----------------------------------------------------
    public boolean deleteChild(int n){
        if (children.length==0){
            return false;
        }
        else {
            Human[] newChildrenArr=new Human[children.length-1];
            for (int i=0;i< children.length;i++){
                if (i!=n){
                    newChildrenArr[i]=children[i];
                }
            }
            children=newChildrenArr;
            return true;
        }
    }
//******************************************************************************
    public int countFamily(){
        int count=2;
        count=children.length;
        if (pet!=null)
            count+=1;
        return count;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                ", family=" + family +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running for Family...");
    }
}

