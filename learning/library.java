import java.util.HashMap;

/* Takes a HashMap of books and prints out the books
that are paired with true (meaning that they've been finished) */

public class Library {

	public Library() {}
	
	public void getFinishedBooks(HashMap<String, Boolean> library) {
    	if ( library.size() < 1) 
    	{
      		System.out.println("HashMap is empty yo");
    	} 
    	else 
    	{
      		for (String book: library.keySet())
      		{
        		if (library.get(book) == true) 
        		{
          			System.out.println(book);
          		}
      		}
    	}
  	}

  	public static void main(String[] args) 
  	{
    	HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    	myBooks.put("The Road", true);
    	myBooks.put("Infinite Jest", false);
    	myBooks.put("The Great Gatsby", true);
    	myBooks.put("Twilight", false);

    	Library myLibrary = new Library();
    	myLibrary.getFinishedBooks(myBooks);
  	}
}
