
public class This_KeyWord {
    void show(){
        System.out.println("Reference Id of this keyword: " + this);

    }
    int a;  // Instance variable
    This_KeyWord(){ // Local variable
        System.out.println("Default constructor");
    }
    This_KeyWord(int a){
        this();
        /* Instance variable */     this.a  = a;      /* Local variable */
        System.out.println(a);
    }
    public static void main(String [] args){
        This_KeyWord ref_var = new This_KeyWord(10);
        System.out.println("Reference Id of object : " + ref_var);
        ref_var.show();
        // Both reference ID is same
    }
}
