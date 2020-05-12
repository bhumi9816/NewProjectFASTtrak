
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

	public String getVehicleInfo() 
	{
		String temp = "Make: " + make + "\nModel: "+ model + "\nColor: " + color + "\nYear: " + year + "\nLicense Plate: " + liscPlate + "\nClean Vehicle: " + cleanV + "\nNum Axles: " + axles +"\n"; 
		return temp;
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
	public void setMake(String compname) {
		this.make = compname;
		
	}

	public void setLicense_Plate(String licensePlate) {
		this.liscPlate = licensePlate;
	}
	
	public void setModel(String modelArg) {
		this.model = modelArg;
	}
	
	public void setYear(int yearArg) {
		this.year = yearArg;
	}
	
	public void setColor(String colorArg) {
		this.color = colorArg;
	}
	
	public void setAxles(int axleArg) {
		this.axles = axleArg;
	}
	
	public void setClean(boolean cleanArg) {
		this.cleanV = cleanArg;
	}
	public String getMake() {
		return this.c_name;
	}
	
	public String getLp() {
		return this.liscPlate;
	}


}
