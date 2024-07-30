/*

In Java, an object is created from a class.
We have already created the class named Main,
so now we can use this to create objects.

To create an object of Main, specify the
class name, followed by the object name,
and use the keyword new:

*/

public class Main {
    int x = 10;
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);  // Output : 10
        // Modify attributes:
        myObj.x = 20;
        System.out.println(myObj.x);
    }
}
