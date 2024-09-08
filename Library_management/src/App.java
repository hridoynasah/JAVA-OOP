
import java.util.Scanner;

class Library{
    private String student_name;
    private String student_id;

    BookItems[] items;

    public Library(String student_name, String student_id, BookItems[] items) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.items = items;
    }

    public void display(){
        System.out.println("\nStudent's name: " + student_name);
        System.out.println("Student's id: " + student_id);
        System.out.println("Book purchased: \n");
        for(int i = 0; i < items.length; i++){
            items[i].display();
        }
    }

}

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String student_name = sc.nextLine();
        System.out.print("Enter student's id: ");
        String student_id = sc.nextLine();
        System.out.print("How many books do you want to purchase: ");
        int n = sc.nextInt();
        sc.nextLine();

        BookItems[] items = new BookItems[n];

        for(int i = 0; i < items.length; i++){
            System.out.print("Enter book name: ");
            String book_name = sc.nextLine();
            System.out.print("Enter author name: ");
            String author_name = sc.nextLine();
            System.out.print("Enter book id: ");
            String book_id = sc.nextLine();

            items[i] = new BookItems(author_name, book_name, book_id);
        }
        Library l = new Library(student_name, student_id, items);
        l.display();
    }
}
