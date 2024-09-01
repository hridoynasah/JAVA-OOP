
class Student_Info{

    private static  String name; // Class method
    private static  String id; // Class method
    private float cgpa; // Instance variable

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }

    // Class method can't access instance variable
    public static void setCgpa(float cg){
        // cgpa = cg;  --> (So this is not possible)
    }

    public static void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student id  : " + id);
    }


}

public class Interesting {
    // Instance method can access class variable.
    // Class method can't access instance variable. 
    public static void main(String[] args) {
        Student_Info si = new Student_Info();
        si.setName("Mr.Beast");
        si.setId("301X5J0091KZ");
        Student_Info.display();
    }
}
