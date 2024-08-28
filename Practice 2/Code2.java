class Parameterized_Constructor{
    String name; int id; float cgpa;
    Parameterized_Constructor(String name, int id, float cgpa){
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    void show(){
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("CGPA : " + cgpa);
    }
}

public class Code2 {
    public static void main(String[] args){
        Parameterized_Constructor pc = new Parameterized_Constructor("Mr. Ghost", 1826, 3.56f);
        pc.show();
    }
}
