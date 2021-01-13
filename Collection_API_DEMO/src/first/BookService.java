package first;
import java.util.ArrayList;
import java.util.List;

public class BookService {

	public List<Book> findDuplicate(Book[] books) {
		List<Book> duplicateBookList =  new ArrayList<>();
		
		for (int i = 0; i < books.length; i++) {
			for (int j = i+1; j < books.length; j++) {
				if(books[i].equals(books[j])) {
					duplicateBookList.add(books[i]);
					break;
				}
			}
		}
		return duplicateBookList;
	}

	

}
