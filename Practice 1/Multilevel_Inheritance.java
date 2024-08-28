class Student{
    String name; float cgpa; int id;
    void setStudent(String name, float cgpa, int id){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}
class Students_info extends Student{
    String dept; String section;
    void setStudents_info(String dept, String section){
        this.dept = dept;
        this.section = section;
    }
    void show(){
        System.out.println("Student's");
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("ID  : " + id);
        System.out.println("Section: " + section);
        System.out.println("Cgpa: " + cgpa);
    }
}




public class Multilevel_Inheritance {
}
