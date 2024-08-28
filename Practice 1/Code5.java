class Private_Constructor{
    int a; float b; String s;
    private Private_Constructor(){
        a = 10;
        b = 20.54f;
        s = "Hridoy";
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }
    public static void main(String[] args){
        Private_Constructor PC = new Private_Constructor();
        PC.show();
    }
}

public class Code5 {
    // Private Constructor can't access from another class
}
