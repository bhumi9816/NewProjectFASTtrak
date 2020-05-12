package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiclecopyTest 
{
	@Test
	void test() 
	{
		{
			Vehiclecopy tester= new Vehiclecopy();
			boolean correctvalue=false;
			boolean check= tester.validateLicense("23efs");
			assertEquals(correctvalue, check, "Vehicle name plate should be 7-alpha-numeric long. ");
			
			tester.setClean("true");
			boolean correctvalue2=true;
			boolean check1= tester.getClean();
			assertEquals(correctvalue2,check1, "setClean should be able to set the right value. ");
			
			tester.setAxles("3");
			int check2= tester.getAxles();
			assertEquals(3, check2, "Set Axles should set the correct pair of axles. ");
			
			tester.setLicense_Plate("64ms98e");
			String check3= tester.getLp();
			assertEquals("64ms98e", check3, "License plate should be able to save the valid license plate. ");

			tester.setYear("2019");
			int check4=tester.getYear();
			assertEquals(2019, check4,"Valid Year should be saved. ");
			
			tester.setColor("Red");
			String check5= tester.getColor();
			assertEquals("Red", check5, "It should return Red color.");
			
			tester.setModel("CRV");
			String check6=tester.getModel();
			assertEquals("CRV", check6, "It should have returned CRV. ");
		
			
		}
	}
}