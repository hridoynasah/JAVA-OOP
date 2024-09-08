
/*

# Class variable and Class method in java:
# Use static keyword to create class variable and method.
# For accessing class variable and method, don't need to create object of that class.
# Easily accessible by class name.

# Instance variable and Intance method in java:
# No keyword is used to create intance variable and method.
# For accessing intance variable and method, It is mandatory to create object of that class.
# **** Instance method can access class variable. ****
# **** Class method can't access instance variable. ****

*/

class Student {

    // Class variable
    public static String name;
    public static int id;

    // Instance variable
    String Name;
    int Id;

    public Student(String Name, int Id) {
        this.Name = Name;
        this.Id = Id;
    }

    // Instance method
    public void displayS() {
        /*
         * # It's possible:
         * # Instance method can access class variable.
         * System.out.println("Student's name: " + name);
         * System.out.println("Student's id: " + id);
         */

        System.out.println("Student's name: " + Name);
        System.out.println("Student's id: " + Id);

    }

    // Class method
    public static void display() {

        /*
         * # It's not possible :
         * # Class method can't access instance variable.
         * 
         * System.out.println("Student's name: " + Name);
         * System.out.println("Student's id: " + Id);
         */

        System.out.println("Student's name: " + name);
        System.out.println("Student's id: " + id);
    }

}

public class Class_and_Instance {
    public static void main(String[] args) {

        // Using class name for class variable and method.
        Student.name = "Mr.Ghost";
        Student.id = 1002;
        Student.display();

        // Creating object for instance variable and method.

        Student s = new Student("Mr.Haoun", 1001);
        s.displayS();

    }
}
