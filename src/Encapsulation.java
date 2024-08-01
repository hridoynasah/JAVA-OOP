/*
    Encapsulation: Encapsulation is defined as the wrapping up of
    data & methods under a single unit. It also implements data hiding.
    Data - Properties / Attributes / Fields
    Methods - Behaviours
*/

public class Encapsulation {
    public static void main(String[] args){
        Student S= new Student();
        S.setName("Hridoy Hasan");
        S.setID(1001);
        S.setCgpa(3.85f);
        System.out.println(S.getName());
        System.out.println(S.getName());
        System.out.println(S.getName());
    }
}

class Student{
    public String Name;
    public int ID;
    private float Cgpa;

    void setName(String Name){
        this.Name = Name;
    }
    void setID(int ID){
        this.ID = ID;
    }
    void setCgpa(float Cgpa){
        this.Cgpa = Cgpa;
    }
    String getName(){
        return this.Name;
    }
    int getID(){
        return this.ID;
    }
    float getCgpa(){
        return this.Cgpa;
    }

}