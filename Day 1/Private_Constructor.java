
class Private_cnstrtr{
    int a; double b; String c;
    private Private_cnstrtr(){
        a = 10; b = 20.67; c = "Ghost";
        System.out.println(a + " " + b + " " + " " + c);

    }
    // Only possible from same class
    public static void main(String[] args){
        Private_cnstrtr pc= new Private_cnstrtr();
    }

}

public class Private_Constructor {
    // As it is a private constructor. Can't access from other class.

//    public static void main(String[] args){
//        Private_cnstrtr pc= new Private_cnstrtr();
//    }
}
