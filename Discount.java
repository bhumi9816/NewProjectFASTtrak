import java.util.Scanner;

public class Discount {
	private int numPassengers;
	private boolean rushHour;
	private double discountAmount;
	private Scanner myScanner = new Scanner(System.in);
	private Scanner myScanner2 = new Scanner(System.in);
	Discount(){
		numPassengers = 0;
		rushHour = true;
		discountAmount = 0;
		discount();
	}
	
	public void discount() {
		System.out.println("How many passengers are there? ");
		numPassengers = myScanner.nextInt();
		
		if(numPassengers>=2) {
			System.out.println("Carpool discount applied: -$2.00 from total fare");
			discountAmount += -2.0;
		}
		else {
			System.out.println("No carpool discount applied. Not enough passengers for carpool.");
		}
		
		System.out.println("Is it between the time of 5AM-10AM OR 3PM-7PM (Y/N)? ");
		String tempInput = myScanner2.next();
		if(tempInput.compareTo("Y")==0) {
			rushHour = true;
		}
		else if(tempInput.compareTo("N")==0) {
			rushHour = false;
		}
		else {
			System.out.println("Invalid input. No rush hour discount applied.");
		}
		
		if(!rushHour) {
			System.out.println("Rush hour discount applied: -$2.00 from total fare");
			discountAmount += -2.0;
		}
		else {
			System.out.println("No Rush hour discount applied. It is currently rush hour.");
		}
		
	}
	public double getDiscount() {
		return discountAmount;
	}
	
}
