/*
Run time: A polymorphism which exists at the time of execution of the program is called runtime polymorphism.
JVM : JVM is a runtime environment.
Method overriding: Whenever we are writing method in super and sub classes in such a way that method name and parameter must be same called method
overriding.


                                Method     (JVM will check in super class that method exists or not)
                                /    \
                               /      \
                             YES      NO (Compilation Error)
                             /
                            /
                        Overridden
                          or not
                        /       \
                       /         \
                     YES          NO
                     /              \
                    /                \
                 Call.               Call
               Sub-Class          Super-Class
                Method.             Method
*/

class Shape{
    void show(){
        System.out.println("Can't define shape.");
    }

}
class Square extends Shape{
    @Override
    void show(){
        super.show();
        System.out.println("Shape: Square");
    }
}


public class Polymorphism2 {
    public static void main(String[] args){
        // Object reference would created of superclass
        // Object would created of subclass
        Square ref_var = new Square();
        ref_var.show();

    }
}
