// Abstract Class and Method.

abstract class Human{
    Human(){
        System.out.println("All Humans.");
    }
    public abstract void hair();
}
class Men extends Human{
    Men(){
        super(); // It will call Human() constructor.
    }
    public void hair(){
        System.out.println("Men's hair is short.");
    }
}
class Women extends Human{
    public void hair(){
        System.out.println("Women's hair is long.");
    }
}

public class CodeB {
    public static void main(String[] args){
        Women w = new Women();
        Men m = new Men();
        w.hair();
        m.hair();
    }
}
