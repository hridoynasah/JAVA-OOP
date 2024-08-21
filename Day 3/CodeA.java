// Abstract class

abstract class Student{
    String name;
    void setName(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name: " + name);
    }

}
class Students_info extends Student{
    int id;
    void setId(int id){
        this.id = id;
    }
    void show(){
        System.out.println("Name: " + name);
        System.out.println("Id  : " + id);
    }
}

public class CodeA {
    public static void main(String[] args){
        // Creating reference of superclass through subclass object.
        Student s = new Students_info();
        s.setName("Mr.Ghost");
        s.display();
    }
}
