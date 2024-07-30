public class Class_And_Object {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        pen1.setTip(5);
        System.out.println(pen1.color+ " " + pen1.tip);
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String clr){
        color = clr;
    }
    void setTip(int tp){
        tip = tp;
    }
}