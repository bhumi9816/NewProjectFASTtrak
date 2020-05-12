

//import java.util.*;

import java.util.*;

public class Vehiclecopy
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
	private String c_name;
	

	public Vehiclecopy() 
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

	public Vehiclecopy(String dID, String m, String mdl, int y, String col, String lp,boolean cv, int num, int ax)
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
	
	public Vehiclecopy(String m, String mdl, int y, String lp, String col, int ax) {
		this.make = m;
		this.model = mdl;
		this.year = y;
		this.liscPlate = lp;
		this.color = col;
		this.axles = ax;
	}
	
	public void deleteVehicle() 
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
	
	//Setters
	public void setVehicleInfo(String dID, String m, String mdl, int y, String col, String lp,boolean cv, int num, int ax)
	{
		this.dashID=dID;
		this.model=mdl;
		this.color=col;
		this.year=y;
		this.liscPlate=lp;
		this.cleanV=cv;
		this.num_of_vehicle=num;
		this.axles=ax;
		this.make=m;	
	}
	
	public void set_Dashid(String dID)
	{
		this.dashID=dID;
	}
	
	
	public void setModel(String model) 
	{
		this.model = model;
	}
	
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	
	public void setYear(String year) 
	{
		this.year = Integer.parseInt(year);
	}
	
	
	public void setLicense_Plate(String licensePlate) 
	{
		this.liscPlate = licensePlate;
	}
	

	public void setClean(String arg) 
	{
		if(arg.compareTo("true")==0) {
			cleanV=true;
		}
		else {
			cleanV=false;
		}
	}
	

	public void setAxles(String axle) 
	{
		this.axles = Integer.parseInt(axle);
	}
	
	
	public void setNumberOfVehicle(int num)
	{
		this.num_of_vehicle=num;
	}
	
	
	public void setMake(String compname) 
	{
		this.make = compname;
	}

	
	
	
	
	//Getters
	public String getVehicleInfo() 
	{
		String temp = "Make: " + make + "\nModel: "+ model + "\nColor: " + color + "\nYear: " + year + "\nLicense Plate: " + liscPlate + "\nClean Vehicle: " + cleanV + "\nNum Axles: " + axles +"\n"; 
		return temp;
	}
	
	
	public String getDashid() 
	{
		return this.dashID;
	}
	
	
	public String getModel()
	{
		return this.model;
	}
	
	
	public String getColor()
	{
		return this.color;
	}
	
	
	public int getYear()
	{
		return this.year;
	}
	
	
	public String getLp() 
	{
		return this.liscPlate;
	}
	

	public int getAxles()
	{
		return this.axles;
	}
	
	
	public String getLisc_Plate()
	{
		return this.liscPlate;
	}
	
	
	public boolean getClean() 
	{
		return this.cleanV ;
	}	
	
	
	public int getNumberOfVehicles() 
	{
		return num_of_vehicle;
	}
	
	
	public String getMake()
	{
		return this.c_name;
	}
	
	public boolean validateLicense(String arg) {
		if(arg.length()==7) {
			return true;
		}
		else {
			return false;
		}
	}
	


}
