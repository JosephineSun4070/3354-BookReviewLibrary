package junit;

import java.util.*;

public class Junit {
	
	// Randomly generating an ArrayList of BookPage to simulate our database
	// Each BookPage has a pageID and contains a book, each book has an ISBN 
	// We want to search for a BookPage via a particular book ISBN
	// searchISBN will return the BookPage's pageID
	
	List <BookPage> BookList = new ArrayList<BookPage>();	
	final int numPages = 50;
	
	String searchISBN(String string) {
		if ((string.length() != 10) && (string.length() != 13)) {
			return "invalid length";  									// ISBN search query has incorrect number of digits
		}
		else {
			for (int i = 0; i < BookList.size(); i++){
				if (string == BookList.get(i).getISBN()) {
					return BookList.get(i).pageID;
				}
			}
			return "not found";											// ISBN search query not found in BookList
		}
	}
	void printList() {
		for (int i = 0; i < BookList.size(); i++){
			System.out.println("pageID: " + BookList.get(i).pageID + "\t\tISBN: " + BookList.get(i).getISBN());
		}
	}

	Junit(){	
		for (int i = 0; i < numPages; i++) {
			BookPage b = new BookPage();
			BookList.add(b);
		}
		
		BookPage page1 = new BookPage("1234567890");					// insert search targets into the Booklist at a random location
		BookPage page2 = new BookPage("0001234567890");					// these are for valid test cases
		Random random = new Random();									
		int ranDigit = (int)(random.nextFloat()*(numPages));
		BookList.add(ranDigit, page1);
		ranDigit = (int)(random.nextFloat()*(numPages));
		BookList.add(ranDigit, page2);
	}
	
	
	private class Book{
		private String ISBN;
		//title
		//genre
		//series
		
		Book(){
			Random random = new Random();
			boolean B = random.nextBoolean();		
			ISBN = (B) ? randomTen() : randomThirteen();				// each book has a random ISBN consisting of ten or thirteen digits
		}
		Book(String string){
			ISBN = string;
		}
		
		public String getISBN() {
			return ISBN;
		}
		
		private String randomTen() {
			Random random = new Random();
			StringBuilder buffer = new StringBuilder(10);
			
			for (int i = 0; i < 10; i++) {
				int ranDigit = 48 + (int)(random.nextFloat()*(10));		// for each char in String ISBN, generate random ascii value (0-9)
				buffer.append((char)ranDigit);
			}
			String randomISBN = buffer.toString();
			return randomISBN;
		}
		
		private String randomThirteen() {
			Random random = new Random();
			StringBuilder buffer = new StringBuilder(10);
			
			for (int i = 0; i < 13; i++) {
				int ranDigit = 48 + (int)(random.nextFloat()*(10));		// for each char in String ISBN, generate random ascii value (0-9)
				buffer.append((char)ranDigit);
			}
			String randomISBN = buffer.toString();
			return randomISBN;
		}
	}
	
	private class BookPage{
		String pageID;
		private Book book;
		//reviews
				
		BookPage(){
			Random random = new Random();
			StringBuilder buffer = new StringBuilder(10);
			
			for (int i = 0; i < 8; i++) {
				int ranDigit = 48 + (int)(random.nextFloat()*(10));		// for each char in String ISBN, generate random ascii value (0-9)
				buffer.append((char)ranDigit);
			}
			pageID = buffer.toString();
			book = new Book();
		}
		
		BookPage(String string){
			pageID = "11111111";										// for valid test cases; assertEquals("11111111", ___ )
			book = new Book(string);
		}
		
		public String getISBN() {
			return book.getISBN();
		}
	}	
}
