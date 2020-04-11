
//import java.util.*;


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
	

	public Vehicle() 
	{
		this.dashID=" ";	
		this.make=" ";	
		this.year=0;
		this.model=" ";				
		this.color=" ";		
		this.axles=0;		
		this.liscPlate=" ";
		this.cleanV=true;	
		this.num_of_vehicle=0;
	}

	public Vehicle(String dID, String m, String mdl, int y, String col, String lp,boolean cv, int num, int ax)
	{

		this.dashID=" ";	
		this.make=" ";	
		this.year=0;
		this.model=" ";				
		this.color=" ";		
		this.axles=0;		
		this.liscPlate=" ";
		this.cleanV=true;	
		this.num_of_vehicle=0;

	}
	
	public void setVehicleInfo(String dID, String m, String mdl, int y, String col, String lp,boolean cv, int num, int ax)
	{
		dashID=dID;
		model=mdl;
		color=col;
		year=y;
		liscPlate=lp;
		cleanV=cv;
		num_of_vehicle=num;
		axles=ax;
		make=m;
		
	}

	public String getVehicleInfo() 
	{
		return "DashID: " + dashID + "\nBrand: "+ make + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color + "\nAxles" + axles + "\nLicense Plate: "+ liscPlate + "\nClean Vehicle: "+  cleanV;
	}

	public void setAxles(int ax)
	{
		this.axles=ax;
	}
	
	public int getaxles()
	{
		return this.axles;
	}
	
	public void setLisc_Plate(String lp)
	{
		this.liscPlate=lp;
	}
	
	public String getLisc_Plate()
	{
		return this.liscPlate;
	}
	
	public void setNumberOfVehicle(int num)
	{
		this.num_of_vehicle=num;
	}
	
	public int getNumberOfVehicles() 
	{
		return num_of_vehicle;
	}

	public void set_Dashid(String dID)
	{
		this.dashID=dID;
	}
	
	public String get_Dashid() 
	{
		return this.dashID;
	}
	
	
	public void deleteVehicle(String dID) 
	{
		this.make=" ";	
		this.year=0;
		this.model=" ";				
		this.color=" ";		
		this.axles=0;		
		this.liscPlate=" ";
		this.cleanV=true;	
		this.num_of_vehicle=0;
	}


}
