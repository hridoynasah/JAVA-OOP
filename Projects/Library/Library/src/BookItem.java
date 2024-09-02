public class BookItem {
    private String bookId;
    private String bookName;
    private String bookAuthor;

    public BookItem(String bookId, String bookName, String bookAuthor){
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
    public void display(){
        System.out.println();
        System.out.println("Book name: " + bookName);
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Author: " + bookAuthor);
    }
}
