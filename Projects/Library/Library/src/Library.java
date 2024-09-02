
import java.util.Scanner;

public class Library {

    private String studentID;
    private String studentName;
    // Array or Class
    BookItem[] bookItems;

    public Library(String studentID, String studentName, BookItem[] bookItems) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.bookItems = bookItems;
    }

    public void display(){
        System.out.println("Student's name: " + studentName);
        System.out.println("Student's id: " + studentID);
        for(int i = 0; i < bookItems.length; i++){
            bookItems[i].display();
        }
        System.out.println("Thanks for taking books.Please come again.......");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        System.out.print("Enter how many books do you want to take: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        BookItem[] arrBookItems = new BookItem[n];
        String bId;
        String bName;
        String bAuthor;
        for(int i = 0; i < n; i++){
            System.out.print("Book Id: ");
            bId = sc.next();
            sc.nextLine();
            System.out.print("Book name: ");
            bName = sc.nextLine();
            
            System.out.print("Book Author: ");
            bAuthor = sc.nextLine();
            arrBookItems[i] = new BookItem(bId, bName, bAuthor);
        } 
        String studentName;
        String studentId;
        System.out.print("Enter student name: ");
        studentName = sc.nextLine();

        System.out.print("Enter student id: ");
        studentId = sc.next();

        Library L = new Library(studentId, studentId, arrBookItems);
        L.display();
    }
}
