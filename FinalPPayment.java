package finalProject.codejava;

import java.util.Scanner;
import java.util.Date;

public class Payment {
	private String cardName;
	private String cardNum;
	private String expDate;
	private String ccv;
	private double acctBalance;
	private String transactionHistory = "";
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
	
	public String getCardInfo() {
		String x = "Card Name: " + cardName + "\nCard Number: " + cardNum + "\nExp Date:" + expDate + "\nCCV:" + ccv + "\nacctBalance:" + acctBalance + "\n";
//		System.out.println(x);
		return x;
	}

	
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
	
	public void setCardName(String cardNameArg) {

		cardName = cardNameArg;

	}
	
	public void setCardNum(String cardNumArg) {

		cardNum = cardNumArg;

	}
	
	public void setExpDate(String expDateArg) {

		expDate = expDateArg;

	}
	
	public void setCCV(String ccvArg) {

		ccv = ccvArg;

	}
	
	public String deleteCardInfo() {
		cardName = "";
		cardNum = "";
		expDate = "";
		ccv = "";
		return "Deleted Card Info";
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
	

	
	public void loadAccount(String amt) { //User will reload their acct balance in anticipation of charges in the future
		double reloadAmount = Double.parseDouble(amt);
		acctBalance = acctBalance+reloadAmount;
	}
	
	public String receiveCharge() { 
		Final_Fare newFare = new Final_Fare();
		double finalFareCharge = newFare.finalFare();

		acctBalance = acctBalance-finalFareCharge;

		String temp = newFare.getFinalDetails();
		addTransactionHistory(temp);
		return temp;
	}
	
	public double getBalance() {
		return acctBalance;
	}
	
	public String getTransactionHistory() {
		return transactionHistory;
	}
	
	public void addTransactionHistory(String transArg) {
		transactionHistory += "-" + transArg;
	}
	public void printBalance() {
		System.out.println("Current Account Balance: $" + acctBalance);
	}
}


/*
 * Fields for Base_cost */
class Base_Cost {
	private double farePrice;
	private String location;
	private int numOfAxles;
	
	
	Base_Cost(){
		location = "";
		farePrice = 0.0;
		baseCost();
	}
	
	public void baseCost() {
		//Get Axle information
		
		int bridgeNum; 
		bridgeNum = (int)(Math.random()*((7-1)+1)+1);
		
		
		if(bridgeNum == 1) {
			location = "ANT";
			farePrice = 6.0;
		}
		else if(bridgeNum == 2) {
			location = "BEN";
			farePrice = 6.0;
		}
		else if(bridgeNum == 3) {
			location = "CAR";
			farePrice = 6.0;
		}
		else if(bridgeNum == 4) {
			location = "DUM";
			farePrice = 6.0;
		}
		else if(bridgeNum == 5) {
			location = "RIC";
			farePrice = 6.0;
		}
		else if(bridgeNum == 6) {
			location = "SFO";
			farePrice = 6.0;
		}
		else if(bridgeNum == 7) {
			location = "SMH";
			farePrice = 6.0;
		}
		else { 
			location = "ERR";
			farePrice = 0.0;
		}
	}
	
	public String getLocation() {
		return location;
	}
	
	public double getBaseCost() {
		return farePrice;
	}
	
}

/*
 * Fields of Discount*/

class Discount {
	private int numPassengers;
	private boolean rushHour;
	private double discountAmount;
	private boolean carPoolFlag = false;
	private boolean rushHourFlag = false;
	private Scanner myScanner = new Scanner(System.in);
	private Scanner myScanner2 = new Scanner(System.in);
	Discount(){
		numPassengers = 0;
		rushHour = true;
		
		discountAmount = 0;
		discount();
	}
	
	public void discount() {

		numPassengers = (int) (Math.random()*(3-1+1)+1);

		
		if(numPassengers>=2) {
//			System.out.println("Carpool discount applied: -$2.00 from total fare");
			discountAmount += -2.0;
			carPoolFlag = true;
		}
		else {
//			System.out.println("No carpool discount applied. Not enough passengers for carpool.");
		}
		

		int tempInput = (int)(Math.random()*(1-0+0)+0);

		if(tempInput==1) {
			rushHour = true;
		}
		else{
			rushHour = false;
		}
		
		if(!rushHour) {
//			System.out.println("Rush hour discount applied: -$2.00 from total fare");
			discountAmount += -2.0;
			rushHourFlag = true;
		}
		else {
//			System.out.println("No Rush hour discount applied. It is currently rush hour.");
		}
		
	}
	public double getDiscount() {
		return discountAmount;
	}
	public String getDiscountDetails() {
		String temp = "Discounts applied: \n";
		if(carPoolFlag) {
			temp+= "Carpool discount applied\n";
		}
		if(rushHourFlag) {
			temp+="Rush hour discount applied\n";
		}
		return temp;
	}
	
}



/*
 * Fields of Final_Fare */

class Final_Fare {
	
	//Used to figure out final cost
	private Discount discount1;
	private Base_Cost basecost1;
	private double finalAmountToBeCharged;
	Final_Fare(){
		basecost1 = new Base_Cost();
		discount1 = new Discount();
	}
	
	public double finalFare() {
		finalAmountToBeCharged = basecost1.getBaseCost()+discount1.getDiscount();
		return finalAmountToBeCharged;
	}
	
	public String getFinalDetails() {
		String temp = "New Transaction: Crossed at " + basecost1.getLocation() + ". Base Cost is: $" + basecost1.getBaseCost() + "\n";
		temp += discount1.getDiscountDetails();
		temp += "Discount amount: " + discount1.getDiscount()+"\n";
		temp += "\nFinal Cost for Trip: $"+finalAmountToBeCharged+"\n"+"\n";
		return temp;
	}
}






