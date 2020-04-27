import java.util.*;


public class Vehicle 
{
	private String dashID;
	
	//make is the company of the car
	private String make;
	
	private String model;
	private int year;
	private String color;
	private int axles; 
	private String liscPlate;
	private boolean cleanV;
	private int num_of_vehicle;
	


	public void setVehicleInfo(String dID, String m, int y, String col, String lp,boolean cv, int num, int ax)
	{
		dashID=dID;
		model=m;
		color=col;
		year=y;
		liscPlate=lp;
		cleanV=cv;
		num_of_vehicle=num;
		axles=ax;
	}

	public String getVehicleInfo() 
	{
	return "DashID: "+ dashID + "\tBrand: "+ make+ "\tModel: "+ model+ "\tYear: "+ 		year+ "\tColor: "+color+"\tAxles"+axles+ "\nLicense Plate: "+liscPlate + "\nClean 	Vehicle: "+cleanV;

	}

	public int getVehicles() 
	{
		return num_of_vehicle;
	}

	public void deleteVehicle() 
	{
		//will take care of this code while proceeding
	
	}


}
