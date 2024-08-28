public class Static_Instance_Block {
    Static_Instance_Block(){
        System.out.println("This is a constructor.");
    }

    public static void main(String[] args){
        Static_Instance_Block SIB = new Static_Instance_Block();
        System.out.println("This is the main Method.");

    }

    static {
        System.out.println("This is a static block.");
    }
    {
        System.out.println("This is a instance block.");
    }
}
