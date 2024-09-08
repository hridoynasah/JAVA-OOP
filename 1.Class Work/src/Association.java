class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void display(){
        System.out.println("Radius of the circle: " + radius);
    }
}

class Rectangle{

    private double height;
    private double width;

    // For association we have to create a reference variable of association class.
    
    private Circle circle;

    public Rectangle(double height, double width, Circle circle){
        this.height = height;
        this.width = width;
        this.circle = circle;
    }

    public void display(){
        circle.display();
        System.out.println("Height of rectangle: " + height);
        System.out.println("Width of rectangle: " + width);
    }
}


public class Association {
    public static void main(String[] args) {
        Circle c = new Circle(10.4);
        Rectangle r = new Rectangle(14.99, 12.89, c);
        r.display();
    }
    
}
