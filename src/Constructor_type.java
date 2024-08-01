/* Types of constructor :
    i) Non-parameterized
    ii) Parameterized
    iii) Copy Constructor
*/


public class Constructor_type {
    public static void main(String[] args){
        Student_ s1 = new Student_();
        Student_ s2 = new Student_("DB Harun");
        Student_ s3 = new Student_(1);
        // Constructor overloading : concept of polymorphism
    }
}

class Student_{
    String name;
    int roll;

    Student_(){
        System.out.println("Constructor is called....");
    }
    Student_(String name){
        this.name = name;
    }
    Student_(int roll){
        this.roll = roll;
    }

}