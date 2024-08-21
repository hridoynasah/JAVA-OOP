/*
    Java Encapsulation
*/

public class Encapsulation {
    private String name;
    private int id;
    private float cgpa;
    // Data abstraction
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args){
        Encapsulation si = new Encapsulation();
        si.setName("Mr. Ghost");
        String name = si.getName();
        System.out.println("Name: "+name);
    }
}
