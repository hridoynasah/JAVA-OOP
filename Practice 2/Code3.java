class Copy_Constructor{
    String name; int id; float cgpa;
    Copy_Constructor(String name, int id, float cgpa){
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    Copy_Constructor(Copy_Constructor ref_var){
        name = ref_var.name;
        id = ref_var.id;
        cgpa = ref_var.cgpa;
    }
    void show(){
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("CGPA : " + cgpa);
    }
}

public class Code3 {
    public static void main(String[] args){
        Copy_Constructor cc = new Copy_Constructor("Mr.Ghost", 1826, 3.56f);
        // For making copy constructor you have to pass the object, which object's copy constructor you want to make.
        Copy_Constructor ref_var = new Copy_Constructor(cc);
        ref_var.show();
    }
}
