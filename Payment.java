import java.util.Scanner;

public class Payment {
	private String cardName;
	private long cardNum;
	private int expDate;
	private int ccv;
	private float acctBalance;
	
	public Payment() {
		cardName = "";
		expDate = 000000;
		ccv = 000;
		acctBalance = 0;
	}
	
	public Payment(String cardNameArg,int expDateArg,int ccvArg,float acctBalanceArg) {
		cardName = cardNameArg;
		expDate = expDateArg;
		ccv = ccvArg;
		acctBalance = acctBalanceArg;
	}
	
	public void getCardInfo() {
		String x = "Card Name: " + cardName + "\nExp Date:" + expDate + "\nCCV:" + ccv + "\nacctBalance:" + acctBalance + "\n";
		System.out.println(x);
	}
	
	public void setCardInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the card name? ");
		cardName = scan.nextLine();
		
		System.out.print("What is the card number? ");
		cardNum = scan.nextLong();
		
		System.out.print("What is the exp date? (example: 11/20 = 112020");
		expDate = scan.nextInt();
		
		System.out.print("What is the ccv? ");
		ccv = scan.nextInt();
		
		System.out.print("What is the account balance? ");
		acctBalance = scan.nextFloat();
		
		System.out.println("Card information saved successfully");
	}
	
	public void deleteCardInfo() {
		cardName = "";
		expDate = 000000;
		ccv = 000;
		acctBalance = 0;
	}
	
	public void schedulePay() { //Not sure what this function is supposed to do yet, will revisit later
		
	}
	
	public void loadAccount() { //Not sure what this function is supposed to do yet, will revisit later
		
	}
}

