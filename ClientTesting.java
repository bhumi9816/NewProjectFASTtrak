package finalProject.codejava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTesting {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void test_id() {
		DashCustomer d = new DashCustomer();
		
		//checking for correct UserId
		
		assertEquals(true, d.checkUserId("bhumi34"));
		assertEquals(false, d.checkUserId("bhd"));
		assertEquals(false, d.checkUserId("bhummi34@"));
		
		//checking for correct password
		
		assertEquals(false, d.checkPassword("hk89"));
		assertEquals(false, d.checkPassword("password"));
		assertEquals(true, d.checkPassword("Password34@"));
		assertEquals(false, d.checkPassword("Gl34@"));
	}

}
