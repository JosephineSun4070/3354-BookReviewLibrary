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

	//	case 1)		N = 10 			digit characters
			pageID = test.searchISBN("1234567890");
					
	//	case 2)		N = 13			digit characters
			//pageID = test.searchISBN("0001234567890");
			
	//	case 3)		N < 10 			digit characters
			//pageID = test.searchISBN("123456");		
			
	//	case 4)		10 < N < 13		digit characters
			//pageID = test.searchISBN("12345678900");
			
	//	case 5)		13 < N 			digit characters
			//pageID = test.searchISBN("123456789000000");		

	//	case 6)		N = 10 			non-digit characters
			//pageID = test.searchISBN("abc!@#abc+");
			
	//	case 7)		N = 13 			non-digit characters
			//pageID = test.searchISBN("abc!@#abc+tuv");	
			
	//	case 8)		N < 10 			non-digit characters
			//pageID = test.searchISBN("abc");
			
	//	case 9)		10 < N < 13 	non-digit characters
			//pageID = test.searchISBN("abcd&#GSibs");		
			
	//	case 10)	13 < N 			non-digit characters
			//pageID = test.searchISBN("Sso;Q#@hkswafohas");
	
	//	case 11)	N = 10 			digit and non-digit characters
			//pageID = test.searchISBN("1@345dd8V0");			
			
	//	case 12)	N = 13 			digit and non-digit characters
			//pageID = test.searchISBN("12@$s34Fs7890");
			
	//	case 13)	N < 10			digit and non-digit characters
			//pageID = test.searchISBN("A2c@");		
			
	//	case 14)	10 < N < 13 	digit and non-digit characters
			//pageID = test.searchISBN("123@#!lksAJL");
			
	//	case 15)	13 < N 			digit and non-digit characters	
			//pageID = test.searchISBN("!@#;lkjASD@1239$8");
	
		
			assertEquals("11111111", pageID);
	}


}
