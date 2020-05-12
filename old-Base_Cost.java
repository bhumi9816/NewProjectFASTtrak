import java.util.Scanner;

public class Base_Cost {
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
		
		int bridgeNum; //Used in menu selection
//		System.out.println("1. Antioch Bridge");
//		System.out.println("2. Benicia-Martinez Bridge");
//		System.out.println("3. Carquinez Bridge");
//		System.out.println("4. Dumbarton Bridge");
//		System.out.println("5. Richmond-San Rafael Bridge");
//		System.out.println("6. San Francisco-Oakland Bay Bridge");
//		System.out.println("7. San Mateo-Hayward Bridge \n");
//		System.out.println("Please select which bridge you crossed: ");
//		bridgeNum = myScanner.nextInt();
		bridgeNum = (int)(Math.random()*((7-1)+1)+1);
//		System.out.print("Random Bridge: " + bridgeNum);
		
		
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
		else { //If invalid bridge is selected: Charge $0 and do nothing.
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
