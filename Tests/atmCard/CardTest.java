package atmCard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
class CardTest {
	
	private Scanner input = new Scanner(System.in);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void resultTest() {
		System.out.print("Enter the card number for verification: ");
		long number = input.nextLong();
		String num = String.valueOf(number);
		
		switch(num.charAt(0)) {
			case '4': 
				Card visaCard = new VisaCard();
			try {
				visaCard.result(num);
			} catch (CardException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
				break;
			
			case '5': 
				Card masterCard = new MasterCard();
			try {
				masterCard.result(num);
			} catch (CardException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
				break;
				
			case '6': 
				Card discoverCard = new DiscoverCard();
			try {
				discoverCard.result(num);
			} catch (CardException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
				break;
				
			case '3': 
				if(num.charAt(1) == 7) {
					 Card americanExpress = new AmericanExpressCard();;
					try {
						americanExpress.result(num);
					} catch (CardException e) {
						// TODO Auto-generated catch block
						e.getMessage();
					}
				}
				break;
		}	
	}
}
