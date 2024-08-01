/* Constructors: Constructor is special method which is invoked
   automatically at the time of object creation.
   -Constructor have the same name as class.
   -Constructor don't have return type.(Not even void)
   -Constructor are only called once, at object creation.
   ** It can't be call 2nd time**
   -Memory Allocation happens when constructor is called.
   -It calls automatically.
*/


public class Constructor {
    public static void main(String[] args){
        Students s1 = new Students("DB Harun",1001,3.85f);
        System.out.println("Name : " + s1.Name);
        System.out.println("ID   : " + s1.ID);
//        System.out.println("CGPA : " + s1.Cgpa);
    }
}

class Students{
    public String Name;
    public int ID;
    private float Cgpa;

    Students(String Name, int ID, float Cgpa){
        this.Name = Name;
        this.ID = ID;
        this.Cgpa = Cgpa;
        System.out.println("Constructor is called.");
    }

    String getName(){
        return this.Name;
    }
    int getID(){
        return this.ID;
    }
    float getCgpa(){
        return this.Cgpa;
    }

}
