// Java Constructor

class Demo1{
    int a; String name; float b; boolean bl;
//    Demo1(){
//        a = 0;
//        name = null;
//    }
    void show(){
        System.out.println(a + " " + name + " " + b + " " + bl);
        // Default constructor made and initialized all value.
    }
}


public class Test2 {
    public static void main(String[] args){
        Demo1 ref = new Demo1();
        ref.show();
    }
}
