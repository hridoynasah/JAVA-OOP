// Instance method can't access without creating object.
// Instance method can access class variable.
// Class method can't access instance variable.

class Student_{

    // Instance variable
    String name;
    String id;
    public Student_(String name, String id){
        this.name = name;
        this.id = id;
    }

    // Instance method
    public void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student id  : " + id);
    }
}

public class Instance_Var_Method {
    public static void main(String[] args) {

        // Without creating object we can't access instance variable and method.
        Student_ s  = new Student_("Mr.Ghost", "301X5J0091KZ");
        s.display();
    }
    
}
