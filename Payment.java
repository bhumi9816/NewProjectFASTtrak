import java.util.Scanner;
import java.util.Date;

public class Payment {
	private String cardName;
	private String cardNum;
	private String expDate;
	private String ccv;
	private double acctBalance;
	private Scanner myScanner = new Scanner(System.in);
	
	public Payment() {
		cardName = "";
		cardNum = "";
		expDate = "";
		ccv = "";
		acctBalance = 0.0;
	}
	
	public Payment(String cardNameArg,String cardNumArg, String expDateArg,String ccvArg) {
		cardName = cardNameArg;
		cardNum = cardNumArg;
		expDate = expDateArg;
		ccv = ccvArg;
		acctBalance = 0.0;
	}
	
	public void getCardInfo() {
		String x = "Card Name: " + cardName + "\nCard Number: " + cardNum + "\nExp Date:" + expDate + "\nCCV:" + ccv + "\nacctBalance:" + acctBalance + "\n";
		System.out.println(x);
	}
	
//	public void setCardInfo() { 		I need to break this method up for better implimentation
//		
//	}
	
	public String getCardName() {
		return cardName;
	}
	
	public String getCardNum() {
		return cardNum;
	}
	
	public String getExpDate() {
		return expDate;
	}
	
	public String getCCV() {
		return ccv;
	}
	
	public double getAccountBalance() {
		return acctBalance;
	}
	
	public void setCardName() {
		System.out.println("-Editing Card Name-");
		System.out.println("Card Name: ");
		String cardNameArg = myScanner.nextLine();
		cardName = cardNameArg;
		System.out.println("Information updated");
	}
	
	public void setCardNum() {
		System.out.println("-Editing Card Num-");
		System.out.println("Card Number (16 digits): ");
		String cardNumArg = myScanner.nextLine();
		cardNum = cardNumArg;
		System.out.println("Information updated");
	}
	
	public void setExpDate() {
		System.out.println("-Editing Exp Date-");
		System.out.println("Exp Date (Follow format....4/20 => 042020): ");
		String expDateArg = myScanner.nextLine();
		expDate = expDateArg;
		System.out.println("Information updated");
	}
	
	public void setCCV() {
		System.out.println("-Editing CCV-");
		System.out.println("CCV: ");
		String ccvArg = myScanner.nextLine();
		ccv = ccvArg;
		System.out.println("Information updated");
	}
	
	public void deleteCardInfo() {
		cardName = "";
		cardNum = "";
		expDate = "";
		ccv = "";
		acctBalance = 0;
	}
	
	public boolean validateCreditCardNumber(String input) { //Convert string to an array of ints
		int [] creditCardInts = new int[input.length()];
		
		for(int i=0; i<input.length();i++) { 
			creditCardInts[i] = Integer.parseInt(input.substring(i,i+1));
		}
		
		if(creditCardInts.length==16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validateExpDate(String input) { //Convert string to an array of ints
		int [] creditCardExp = new int[input.length()];
		
		for(int i=0; i<input.length();i++) { 
			creditCardExp[i] = Integer.parseInt(input.substring(i,i+1));
		}
		
		if(creditCardExp.length==6) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validateCCV(String input) { //Convert string to an array of ints
		int [] creditCardCCV = new int[input.length()];
		
		for(int i=0; i<input.length();i++) { 
			creditCardCCV[i] = Integer.parseInt(input.substring(i,i+1));
		}
		
		if(creditCardCCV.length==3) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	public void schedulePay() { //Unsure if possible, given the time of project deadline
//		
//	}
	
	public void loadAccount() { //User will reload their acct balance in anticipation of charges in the future
		System.out.println("How much would you like to load? ");
		double reloadAmount = myScanner.nextDouble();
		
		System.out.println("Adding $" + reloadAmount + " to Account Balance");
		acctBalance = acctBalance+reloadAmount;
	}
	
	public void receiveCharge() { //System will call this, deducting funds from the account every time user passes through toll bridge
		Final_Fare newFare = new Final_Fare();
		double finalFareCharge = newFare.finalFare();
		System.out.println("Deducting $" + finalFareCharge + " from Account Balance");
		System.out.print("Previous account balance: " + acctBalance + "\n");
		acctBalance = acctBalance-finalFareCharge;
		System.out.println("New account balance: $" + acctBalance + "\n");
	}
	
	public double getBalance() {
		return acctBalance;
	}
	
	public void printBalance() {
		System.out.println("Current Account Balance: $" + acctBalance);
	}
}

