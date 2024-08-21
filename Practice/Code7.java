import java.util.Arrays;

class Student1{
    String name; float cgpa; int id;
    void setStudent(String name, float cgpa, int id){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}
class Students_info1 extends Student{
    String dept; String section;
    void setStudents_info(String dept, String section){
        this.dept = dept;
        this.section = section;
    }
}
class Students_info2 extends Students_info1{
    String[] courses; String[] course_code;
    void setCourses_code(String[] courses, String[] course_code){
        this.courses = courses;
        this.course_code = course_code;
    }
    void show(){
        System.out.println("Student's");
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("ID  : " + id);
        System.out.println("Section: " + section);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("Courses: ");
        for(int i = 0; i < courses.length; i++){
            System.out.println("Course: "+courses[i] +"Course Code: "+ course_code[i]);
        }
    }
}


public class Code7 {
    public static void main(String[] args){
        Students_info2 si = new Students_info2();
        si.setStudent("Mr. Ghost", 3.81f,1826);
        si.setStudents_info("CSE", "A");
        String[] courses = {"Object Oriented Programming", "System Design", "Digital Electronics", "Numerical Method"};
        String[] course_code = {"CSE221", "CSE222", "CSE223", "CSE224"};
        si.setCourses_code(courses, course_code);
        si.show();
    }
}
