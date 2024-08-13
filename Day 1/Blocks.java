public class Blocks {
    //Default constructor:
    Blocks(){
        System.out.println("It is a constructor.");
    }
    // Instance Block:
    {
        System.out.println("It is a instance block.");
    }
    // Static Block:
    static{
        System.out.println("It is a static block.");
    }
    void show(){
        System.out.println("This is a normal method.");
    }
    static void display(){
        System.out.println("This is a static method.");
    }
    public static void main(String[] args){

        Blocks ref_var = new Blocks();
        display();
        ref_var.show();

        System.out.println("Execution priority: Static Block > Instance Block > Constructor.");
    }

}
