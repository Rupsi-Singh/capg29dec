package first;
import java.util.List;

public class BookTest {

	public static void main(String[] args) {
		Book [] books = {
				new Book(101, "The Leader Who Had No Title", "Robin Sharma","SAMS"),
				new Book(102, "Object Oriented Programming", "Balaguruswami","SAMS"),
				new Book(103, "Head First Java", "Sierra & Bates","BPB"),
				new Book(101, "The Leader Who Had No Title", "Robin Sharma","SAMS"),
				new Book(104, "Head First Servlet and JSP", "Sierra & Bates","BPB"),
				new Book(102, "Object Oriented Programming", "Balaguruswami","SAMS")								
				};
		
		BookService bookService =  new BookService();
		List<Book> duplicateBooks = bookService.findDuplicate(books);
		System.out.println("Size of Duplicate Books : "+duplicateBooks.size());
		System.out.println(duplicateBooks);
		
	}

}
