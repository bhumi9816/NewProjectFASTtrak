import java.util.Scanner;

public class Final_Fare {
	
	//Used to figure out final cost
	private Discount discount1;
	private Base_Cost basecost1;
	private double finalAmountToBeCharged;
	Final_Fare(){
		basecost1 = new Base_Cost();
		discount1 = new Discount();
	}
	
	public double finalFare() {
//		System.out.print("New Transaction: Crossed at " + basecost1.getLocation() + ". Base Cost is: $" + basecost1.getBaseCost() + "\n");
//		System.out.print("Discount amount: " + discount1.getDiscount()+"\n");
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
