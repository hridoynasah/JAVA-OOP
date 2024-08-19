/*
    Super keyword is used to call the Variable, Method, Constructor of super class.
*/

class Student{
    String name; int id;
    void setStudent(){
        name = "Hridoy";
    }
    void show(){
        System.out.println("This is a super method calling.");
    }
    Student(int a){
        System.out.println("Constructor of class Student." + a);
    }
}

class Students extends Student{
    String name = "Hasan";
    void show(){
        super.show();
        System.out.println(name);
        System.out.println(super.name);
    }
    Students(){
        // If you don't include , compiler will automatically include.
        // But for parameterized constructor you must add a super keyword.
        super(10);
        System.out.println("Constructor of class Students......");
    }

}


public class SuperKeyWord {
    public static void main(String[] args){
        Students s = new Students();
        s.setStudent();
        s.show();


    }
}
