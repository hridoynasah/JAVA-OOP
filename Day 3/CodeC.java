abstract class Students{
    // Used for common things
    Students(){
        System.out.println("All Students: ");
    }
    public  abstract void name();
    public  abstract void id();
}
class Rahim extends Students{
    Rahim(){
        super();
    }
    public void name(){
        System.out.println("Name: Rahim");
    }
    public void id(){
        System.out.println("ID  : " + 199021216);
    }

}
public class CodeC {
    public static void main(String[] args){
        // We can't create the object of an abstract class.
        // But we can create object of an abstract class by the help of sub class.
        Students s = new Rahim();
        s.name();
        s.id();
    }
}
