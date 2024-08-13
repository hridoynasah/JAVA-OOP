class Student{
    int ID; float CGPA; String Name;
    // Constructor name same but different parameter.
    Student(){
        System.out.println("Student information:- ");
    }
    Student(String Name){
        this.Name = Name;
        System.out.println("Student name : "+Name);
    }
    Student(int ID, float CGPA){
        this.ID = ID;
        this.CGPA = CGPA;
        System.out.println("Student name : "+ID);
        System.out.println("Student name : "+CGPA);
    }
}


public class Constructor_Overloading {
    public static void main(String[] args){
        Student s = new Student();
        Student name = new Student("Ghost");
        Student info = new Student(1826, 3.56f);
    }
}
