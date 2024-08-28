import java.util.Scanner;

interface  Input{

    // Methods are by default public abstract void
    void calculator();
}

class Calculator implements Input{
    float x; float y;
    @Override
    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's x? ");
        x = sc.nextFloat();
        System.out.print("What's y? ");
        y = sc.nextFloat();
        System.out.print("Which operation do you want to implement? (+, -, *, /, %) choose one: ");
        char choice = sc.next().charAt(0);
        switch (choice){
            case '+':
                System.out.println(x + " + " + y + " = " + (x+y));
                break;
            case '-':
                System.out.println(x + " - " + y + " = " + (x-y));
                break;
            case '*':
                System.out.println(x + " * " + y + " = " + (x*y));
                break;
            case '/':
                System.out.println(x + " / " + y + " = " + (x/y));
                break;
            case '%':
                System.out.println(x + " % " + y + " = " + (x%y));
                break;

        }
    }
}

public class CodeG {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.calculator();
    }
}
