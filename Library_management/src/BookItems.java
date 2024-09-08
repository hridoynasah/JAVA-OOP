class BookItems{
    private String author_name;
    private String book_name;
    private String book_id;

    public BookItems(String author_name, String book_name, String book_id) {
        this.author_name = author_name;
        this.book_name = book_name;
        this.book_id = book_id;
    }

    public void display(){
        System.out.println("Book name: " + book_name);
        System.out.println("Author name: " + author_name);
        System.out.println("Book id: " + book_id);
    }    
    
}