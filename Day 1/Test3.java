// Default Constructor
class Default_Constructor{
    int a; String name; boolean b;

    void show(){
        System.out.println(a + " " + name + " " + b);
        // Output: 0 null false
        /* Default Constructor is automatically called and initialized
        the object at the time of object creation by java compiler*/
    }

}



public class Test3 {
    public static void main(String[] args){
        Default_Constructor DC = new Default_Constructor();
        DC.show();
    }

}
