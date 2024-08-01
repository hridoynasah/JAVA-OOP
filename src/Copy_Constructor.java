/*
    Copy the one object's properties to another.
*/

public class Copy_Constructor {
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.Name = "Hridoy";
        s1.ID = 10001;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 95;
        // Coping object one to another
        Student1 s2 = new Student1(s1);
        s2.password = "xyz";
        s1.marks[2] = 85;

        for (int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student1{
    public String Name;
    public int ID;
    String password;
    int marks[];

    // Copy constructor:
    Student1(Student1 s)
    {
        marks = new int[3];
        this.Name = s.Name;
        this.ID = s.ID;
        this.marks = s.marks;
    }
    Student1(){
        marks = new int[3];
        System.out.println("Constructor is called....");
    }
    Student1(String Name){
        marks = new int[3];
        this.Name = Name;
    }
    Student1(int ID){
        marks = new int[3];
        this.ID = ID;
    }
}