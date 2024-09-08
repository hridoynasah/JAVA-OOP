/*

# Class variable and Class method in java:
# Use static keyword to create class variable and method.
# For accessing class variable and method, don't need to create object of that class.
# Easily accessible by class name.

*/

class Student{

    // Class variable
    public static String name;
    public static int id;

    // Class method
    public static void display(){
        System.out.println("Student's name: " + name);
        System.out.println("Student's id: " + id);
    }
}

public class Class_var_method{
    public static void main(String[] args) {

        // Accessible using class name 

        Student.name = "Mr.Haoun";
        Student.id = 1001; // First boy
        Student.display();
    }
}