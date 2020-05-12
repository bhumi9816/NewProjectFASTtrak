import java.util.Scanner;
import java.util.Random;

public class VehicleDriverClass 
{

	public static void main(String[] args) 
	{
	
		System.out.println("Hello! Please enter your Vehicle details. ");
		Scanner scan_obj= new Scanner(System.in);
		
		//setting up the constructor 
		Vehicle vehicleInfo=new Vehicle("1234", "Lexus", "RX F Sport", 2020, "Red", "45KSP23", true, 1, 4);
		
		System.out.print("Enter the number of Vehicles that you own(Please don't enter 0): ");
		int num = scan_obj.nextInt();
		
		while(num<1)
		{
			System.out.print("Please enter the number of Vehicles that you own(1 or more than 1): ");
			num = scan_obj.nextInt();
		}
		
		//to put the cursor to next line
		scan_obj.nextLine();
		
		//dashId is going to be  a randomly generated number
		Random rand= new Random();
		String dashid= Integer.toString(rand.nextInt(1000));	
		
		for (int i=0; i <num ; i++) 
		{
			System.out.println("Enter the License Plate number of your car(7 alpha-numerical) : ");
			String lp = scan_obj.nextLine();
		
			while(lp.length()!=7)
			{
				System.out.println("Your license plate number should be total of 7 alpha-numerical: ");
				lp = scan_obj.nextLine();
			}
			
			vehicleInfo.setLisc_Plate(lp);
			
			
			System.out.println("Enter the company name of the car: ");
			String mk= scan_obj.nextLine();
			
			//Taking the model name of the car
			System.out.println("Enter the model of your car: ");
			String model_name= scan_obj.nextLine();

			System.out.println("Enter the year of your car: ");
			int yr = scan_obj.nextInt();
			
			//to put the cursor to next line
			scan_obj.nextLine();
			
			System.out.println("Enter the color of the car: ");
			String clr = scan_obj.nextLine();
			
			System.out.println("Enter the number of pair of axles of your car, to know the size of your car (atleast two pairs): ");
			int ax = scan_obj.nextInt();
			
			while(ax<2)
			{
				System.out.println("Please enter the number of axles in your car which should be atleast two pairs: ");
				ax = scan_obj.nextInt();
			}
			vehicleInfo.setAxles(ax);
			
			System.out.println("Is your Vehicle clean?(true/false): ");
			Boolean CV = scan_obj.nextBoolean();
			
			
			vehicleInfo.setVehicleInfo(dashid,mk, model_name, yr, clr, lp, CV, num, ax);
		}
		
		scan_obj.nextLine();
		String y_n;
		System.out.println("Would you like to review the information of the car?(yes/no)");
		y_n= scan_obj.nextLine();	
		
		if(y_n=="no")
		{
			System.out.println("Thank you for your information.");
		}
		else
		{
			System.out.println(vehicleInfo.getVehicleInfo());
		}
		scan_obj.close();
		
		
		vehicleInfo.set_Dashid(dashid);
	}
	

}
