
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void display(){
        System.out.println("Radius: " + radius);
    }
}

class RectangleX{
    private  int height;
    private int width;
    private Circle circle;
    RectangleX(int height, int width, Circle circle){
        this.height = height;
        this.width = width;
        this.circle = circle;
    }
    public void display(){
        circle.display();
        System.out.println("Height: " + height +"\n"+"Width: "+width);
    }
}

public class Association {
    public static void main(String[] args) {
        Circle c = new Circle(4.5);
        RectangleX r = new RectangleX(5, 3, c);
        r.display();
    }
    
}
