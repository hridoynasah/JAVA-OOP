
class Parameterized_Constructor{
    int a, b;
    Parameterized_Constructor(int a, int b){
        this.a = a;
        this.b = b;
    }
    Parameterized_Constructor(int a, String b){
        System.out.println(a+" "+b);
    }
    void show(){
        System.out.println(a+" "+b);
    }
}

public class Test4 {
    public static void main(String[] args){
        Parameterized_Constructor PC = new Parameterized_Constructor(10, 20);
        PC.show();
        Parameterized_Constructor PC1 = new Parameterized_Constructor(20,"Ghost");

    }
}
