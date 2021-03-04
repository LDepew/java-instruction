import java.util.List;

public class BookManagerApp {
	List<Book> bookList = new BookCatalog().getCatalog();

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        
        manager.getBooks(b -> b.getTitle().equals(Book.JAVA)).stream()
        .forEach(System.out::println);
        
        
       
        manager.getBooks(b -> b.getCategory().equals(Book.JAVA)).stream()
        .forEach(System.out::println);
        
        
        manager.getBooks(b -> b.getFormat().equals(Book.PAPERBACK)).stream()
       .forEach(System.out::println);
        
    }    
}