class Constructor_Overloading{
    int a; String s; float f;
    Constructor_Overloading(){
        System.out.println("This is a Constructor.");
    }
    Constructor_Overloading(int a){
        this.a = a;
        System.out.println(a);
    }
    Constructor_Overloading(int a, float f, String s){
        this.a = a;
        this.f = f;
        this.s = s;
        System.out.println(a);
        System.out.println(f);
        System.out.println(s);
    }
}

public class Code6 {
    public static void main(String[] args){
        Constructor_Overloading CO1 = new Constructor_Overloading();
        Constructor_Overloading CO2 = new Constructor_Overloading(10);
        Constructor_Overloading CO3 = new Constructor_Overloading(20, 56.5f, "Hridoy");
    }
}
