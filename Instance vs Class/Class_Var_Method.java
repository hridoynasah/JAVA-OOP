// For accessing class variable and method, don't need to create object of the class.
// We can access it by class name.

class Student{

    // Class variables
    public static String id;
    public static String name;

    // Class method
    public static void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student id  : " + id);
    }

}


public class Class_Var_Method {
    public static void main(String[] args) {
        
        // Easily access without creating object.
        Student.id = "301X5J0091KZ";
        Student.name = "Mr.Ghost";
        Student.display();
    }
}
