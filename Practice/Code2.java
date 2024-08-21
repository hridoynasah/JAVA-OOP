
class Default_Constructor{
    int x; float y; boolean b; String s;
    // Default constructor initialize the  instance variable.
    void show(){
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
        System.out.println("Value of b is: " + b);
        System.out.println("Value of s is: " + s);
    }
}

public class Code2 {
    public static void main(String[] args){
        Default_Constructor DC = new Default_Constructor();
        DC.show();
    }
}
