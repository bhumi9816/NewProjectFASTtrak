import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

public class VehicleTest {

	@Test
	public void test() {
	Vehicle tester= new Vehicle();
	
	tester.setVehicleInfo("1234", "Lexus", "RX F Sport", 2020, "Red", "45KSP23", true, 1, 4);
	//Allowing the user to enter more than 1 Vehicle
	tester.setNumberOfVehicle(10);
	assertEquals(10, tester.getNumberOfVehicles(),"User should be able to add more than one Vehicle.");

	//name plate should be 7-alpha-numeric digit long
	assertEquals("45KSP23",tester.get_Dashid(), "Vehicle name plate should be 7-alpha-numeric long. " );
	
	assertEquals(4, tester.getaxles(), "Axles should be 2 pairs atleast");
	
		
		
	}
;
}
