/*
    Polymorphism: Same method having different behaviour.
    Compile time : A polymorphism which is executes at the time of compilation is called "Compile time", "Early binding", "Static" polymorphism.
    Example: "Method overloading": When ever a class contain more than one method with same name and different types of parameters called overloading.
    Return type don't matter.
*/
class Addition{
    int add(int a, int b){
        return a + b;
    }
    float add(float a, int b){
        return a + b;
    }
    float add(float a, float b){
        return a + b;
    }
}

public class Polymorphism1{
    public static void main(String[] args){
        Addition Add = new Addition();
        System.out.println(Add.add(10.5f, 100));  // Compile time .
        System.out.println(Add.add(10.5f, 10.5f));  // Detect in compile time.
    }
}