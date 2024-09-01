

class Triangle{
    private double area;

    public Triangle(double area) {
        this.area = area;
    }
    public void displayTriangleArea(){
        System.out.println("Area of triangle: " + area);
    }
}

class RectangleX{
    private int height, width;
    private Triangle triangle;

    public RectangleX(int height, int width, Triangle triangle) {
        this.height = height;
        this.width = width;
        this.triangle = triangle;
    }

    public void display(){

        triangle.displayTriangleArea();
        System.out.println("Height: " + height);
        System.out.println("Width : " + width);

    }
    
}

public class Association3 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.89);
        RectangleX r = new RectangleX(7, 4, t);
        r.display();
    }
}
