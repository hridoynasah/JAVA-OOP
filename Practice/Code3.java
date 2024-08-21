class Parameterized_Constructor{
    int z; String name;
    Parameterized_Constructor(int z, String name){
        this.z = z;
        this.name = name;
    }
    void show(){
        System.out.println("Value of z: " + z);
        System.out.println("Your name is: " + name);
    }
}

public class Code3 {
    public static void main(String[] args){
        Parameterized_Constructor PC = new Parameterized_Constructor(10,"Hridoy");
        PC.show();
    }
}
