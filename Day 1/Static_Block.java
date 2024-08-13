public class Static_Block {

    public static void main(String[] args){
        Static_Block sb = new Static_Block();
    }
    // Instance block
    {
        System.out.println("Hello Ghost");
    }
    static {
        System.out.println("Ghost");
    }
}
