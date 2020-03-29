import java.util.Scanner;
import java.util.Date;

public class Payment {
	private String cardName;
	private long cardNum;
	private int expDate;
	private int ccv;
	private double acctBalance;
	private Scanner myScanner = new Scanner(System.in);
	
	public Payment() {
		cardName = "";
		cardNum = 0000000000000000;
		expDate = 000000;
		ccv = 000;
		acctBalance = 0.0;
	}
	
	public Payment(String cardNameArg,long cardNumArg, int expDateArg,int ccvArg,float acctBalanceArg) {
		cardName = cardNameArg;
		cardNum = cardNumArg;
		expDate = expDateArg;
		ccv = ccvArg;
		acctBalance = acctBalanceArg;
	}
	
	public void getCardInfo() {
		String x = "Card Name: " + cardName + "\nCard Number: " + cardNum + "\nExp Date:" + expDate + "\nCCV:" + ccv + "\nacctBalance:" + acctBalance + "\n";
		System.out.println(x);
	}
	
//	public void setCardInfo() { 		I need to break this method up for better implimentation
//		
//	}
	
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
		long cardNumArg = myScanner.nextLong();
		cardNum = cardNumArg;
		System.out.println("Information updated");
	}
	
	public void setExpDate() {
		System.out.println("-Editing Exp Date-");
		System.out.println("Exp Date (Follow format....4/20 => 042020): ");
		int expDateArg = myScanner.nextInt();
		expDate = expDateArg;
		System.out.println("Information updated");
	}
	
	public void setCCV() {
		System.out.println("-Editing CCV-");
		System.out.println("CCV: ");
		int ccvArg = myScanner.nextInt();
		ccv = ccvArg;
		System.out.println("Information updated");
	}
	
	public void deleteCardInfo() {
		cardName = "";
		cardNum = 0000000000000000;
		expDate = 000000;
		ccv = 000;
		acctBalance = 0;
	}
	
	public void schedulePay() { //Add funds into account balance later, can use calendar
		
	}
	
	public void loadAccount() { //User will reload their acct balance in anticipation of charges in the future
		System.out.println("How much would you like to load? ");
		double reloadAmount = myScanner.nextDouble();
		
		System.out.println("Adding $" + reloadAmount + " to Account Balance");
		acctBalance = acctBalance+reloadAmount;
	}
	
	public void receiveCharge(double finalFare) { //System will call this, deducting funds from the account every time user passes through toll bridge
		System.out.println("Deducting $" + finalFare + " from Account Balance");
		acctBalance = acctBalance-finalFare;
	}
	
	public double getBalance() {
		return acctBalance;
	}
	
	public void printBalance() {
		System.out.println("Current Account Balance: $" + acctBalance);
	}
}

