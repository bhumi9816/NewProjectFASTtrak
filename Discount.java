import java.util.Scanner;

public class Discount {
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
//		System.out.println("How many passengers are there? ");
		numPassengers = (int) (Math.random()*(3-1+1)+1);
//		System.out.print("Randomly selected num passengers: " + numPassengers);
		
		if(numPassengers>=2) {
//			System.out.println("Carpool discount applied: -$2.00 from total fare");
			discountAmount += -2.0;
			carPoolFlag = true;
		}
		else {
//			System.out.println("No carpool discount applied. Not enough passengers for carpool.");
		}
		
//		System.out.println("Is it between the time of 5AM-10AM OR 3PM-7PM (Y/N)? ");
		int tempInput = (int)(Math.random()*(1-0+0)+0);
//		System.out.print("Randomly selected rush hour: " + tempInput);
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
