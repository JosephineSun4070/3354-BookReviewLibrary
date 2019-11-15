package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;


class searchISBNTest {
	
	@Test
	public void testSearchISBN() {
		Junit test = new Junit();
		String pageID;
		test.printList();			

// Valid Cases
		
	//	case 1)		N = 10 			digit characters
			pageID = test.searchISBN("1234567890");
			assertEquals("11111111", pageID);
					
	//	case 2)		N = 13			digit characters
			//pageID = test.searchISBN("0001234567890");
			//assertEquals("11111111", pageID);

// Invalid Cases
		
	//	case 3)		N < 10 			digit characters
			//pageID = test.searchISBN("123456");		
			//assertEquals("invalid length", pageID);
			
	//	case 4)		10 < N < 13		digit characters
			//pageID = test.searchISBN("12345678900");
			//assertEquals("invalid length", pageID);
			
	//	case 5)		13 < N 			digit characters
			//pageID = test.searchISBN("123456789000000");
			//assertEquals("invalid length", pageID);

	//	case 6)		N = 10 			non-digit characters
			//pageID = test.searchISBN("abc!@#abc+");
			//assertEquals("not found", pageID);
			
	//	case 7)		N = 13 			non-digit characters
			//pageID = test.searchISBN("abc!@#abc+tuv");
			//assertEquals("not found", pageID);
			
	//	case 8)		N < 10 			non-digit characters
			//pageID = test.searchISBN("abc");
			//assertEquals("invalid length", pageID);
			
	//	case 9)		10 < N < 13 	non-digit characters
			//pageID = test.searchISBN("abcd&#GSibs");
			//assertEquals("invalid length", pageID);
			
	//	case 10)	13 < N 			non-digit characters
			//pageID = test.searchISBN("Sso;Q#@hkswafohas");
			//assertEquals("invalid length", pageID);
	
	//	case 11)	N = 10 			digit and non-digit characters
			//pageID = test.searchISBN("1@345dd8V0");
			//assertEquals("not found", pageID);
			
			
	//	case 12)	N = 13 			digit and non-digit characters
			//pageID = test.searchISBN("12@$s34Fs7890");
			//assertEquals("not found", pageID);
			
	//	case 13)	N < 10			digit and non-digit characters
			//pageID = test.searchISBN("A2c@");
			//assertEquals("invalid length", pageID);
			
	//	case 14)	10 < N < 13 	digit and non-digit characters
			//pageID = test.searchISBN("123@#!lksAJL");
			//assertEquals("invalid length", pageID);
			
	//	case 15)	13 < N 			digit and non-digit characters	
			//pageID = test.searchISBN("!@#;lkjASD@1239$8");
			//assertEquals("invalid length", pageID);
	}
}
