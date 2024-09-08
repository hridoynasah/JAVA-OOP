/*

# Instance variable and Intance method in java:
# No keyword is used to create intance variable and method.
# For accessing intance variable and method, It is mandatory to create object of that class.
# Instance method can access class variable. ****
# Class method can't access instance variable. ****

*/

class Student{

    // Instance variable
    String name;
    int id;
    
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    // Instance method
    public void display(){
        System.out.println("Student's name: " + name);
        System.out.println("Student's id: " + id);
    }
}


public class Instance_var_method {
    public static void main(String[] args) {
        
        // Without creating object, it is not possible to access instance variable and method
        Student s = new  Student("Mr.Haoun", 1001);
        s.display();
    }
}
