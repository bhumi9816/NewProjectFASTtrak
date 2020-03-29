import java.util.Scanner;

public class Driver {
	// full name
	// whole credit/debit card number
	// expiration date w/o slashes
	// 3 digit ccv
	// save, submits and constructs
	// balance check, its like a bill
	// schedule payments will pay off the bill
	// submit
	
	//failure condition if blanks
	//ccv checking
	// credit/card number checking
	
	
	public static void main(String[] args) {
		System.out.println("Testing Payment and Balance Class");
		Payment newCard = new Payment("Chase", 1231222222222222, 042020, 789, 0.0); //Fix constructor
		Scanner myScanner = new Scanner(System.in);
//		newCard.getCardInfo();
//		newCard.setCardName();
//		newCard.setCardNum();
//		newCard.setExpDate();
//		newCard.setCCV();
//		newCard.getCardInfo();
//		
//		newCard.printBalance();
//		newCard.loadAccount();
//		newCard.printBalance();
//		
//		newCard.deleteCardInfo();
//		newCard.getCardInfo();
	}
}
