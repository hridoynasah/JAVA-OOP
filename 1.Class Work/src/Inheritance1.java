// Simple Inheritance

class Shape{
    protected String how_many;
    public Shape(String how_many){
        this.how_many = how_many;
    }

    public void display(){
        System.out.println("There is '" + how_many + "' shapes.");
    }
}

class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width, String how_many){
        super(how_many);
        this.height = height;
        this.width = width;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);

    }
    
}

public class Inheritance1 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(10, 5, "one");
        r.display();
    }
}
