import java.util.Scanner;

interface client{
    // Interface method by default  public and abstract
    void input();
    void output();
}

class Developer implements client{
    String name; double salary;
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: $");
        salary = sc.nextDouble();
    }

    @Override
    public void output() {
        System.out.println("Username: " + name);
        System.out.println("Salary: $" + salary);
    }
}

public class CodeF {
    public static void main(String[] args) {
        Developer g = new Developer();
        g.input();
        g.output();
    }
}
