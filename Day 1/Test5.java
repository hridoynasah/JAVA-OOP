/*
     # Copy Constructor
*/

class Copy_Constructor{
    int a; String b;  // Instance variable
    Copy_Constructor(){
        a = 10; b = "Ghost";
        System.out.println(a + " " + b);
    }
    Copy_Constructor(Copy_Constructor ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
}

public class Test5 {
    public static void main(String[] args){
        Copy_Constructor r_var = new Copy_Constructor();
        Copy_Constructor copy_ref_var = new Copy_Constructor(r_var);

    }
}
