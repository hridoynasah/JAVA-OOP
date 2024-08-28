class Default_Constructor{

    // These are instance variable
    String name; int id; float cgpa;
    // These variables will automatically initialized by default constructor.
    void show(){
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("CGPA : " + cgpa);
    }
}

public class Code1 {
    public static void main(String[] args){
        Default_Constructor DC = new Default_Constructor();
        DC.show();
    }
}
