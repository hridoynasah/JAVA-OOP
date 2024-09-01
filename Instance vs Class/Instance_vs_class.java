class Student{
    private String stid;   // Instance variable
    public  static  String society; // Class variable

    // Instance method.
    public Student(String stid){
        this.stid = stid;
    }
    // Class Method.
    public static  void setSociety(String s){
        society = s;
    }
    // Class Method.
    public static String getSociety(){
        return society;
    }

    // Instance method
    public void display(){
        System.out.println("Student id : " + stid);
        System.out.println("Student society : " + stid);
    }
    public static void emni(){
        System.out.println("This is a class method.");
    }
    public void valoi_to(){
        System.out.println("This is a instance method.");
    }


}

public class Instance_vs_class{
    public static void main(String[] args){
        Student s = new Student("301X5J0091KZ");
        s.valoi_to();
        Student.emni();
        Student.society = "DIU";
        System.out.println("Student's society: " + Student.society);
        
    }
}