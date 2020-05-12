package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class JUNIT-Client {

	@Before
	void set_up() {
		DashCustomer d1 = new DashCustomer();
		assertNull("The client object is null", d1);
	}
	
	@Test
	void test_id() {
		DashCustomer d = new DashCustomer();
		
		//checking for correct UserId
		
		assertEquals(true, d.checkUserId("bhumi34"));
		assertEquals(false, d.checkUserId("Bhd"));
		assertEquals(false, d.checkUserId("bhummi34@"));
		assertEquals(false, d.checkUserId("Vhkj23##"));
	}
	
	@Test
	void test_password() {
		DashCustomer d = new DashCustomer();
		//checking for correct password
		
		assertEquals(false, d.checkPassword("hk89"));
		assertEquals(false, d.checkPassword("password"));
		assertEquals(true, d.checkPassword("Password34@"));
		assertEquals(false, d.checkPassword("Gl34@"));
	}
	
	@Test
	void set_id() {
		DashCustomer d1 = new DashCustomer();
		
		//testing set_userName
		
		d1.setId("bhumi34");	
		String i = d1.getId();
		String expected = "bhumi34";
		
		assertEquals(expected, i);
		
		d1.setId("bhu");		
		String j = d1.getId();
		assertEquals("bhu", j);
		
		d1.setId("Vhkj23##");
		String k = d1.getId();
		assertEquals("Vhkj23##", k);
		
		/*
		 * Testing to see that it's okay to set any userId; however, with checkId only specific id's
		 * with specific characters and length are accepted*/
		
		boolean check = d1.checkUserId(i);
		assertEquals(true, check);
		
		boolean check1 = d1.checkUserId(j);
		assertEquals(false, check1);
		
		boolean check2 = d1.checkUserId(k);
		assertEquals(false, check2);
	}
	
	@Test
	void set_password() {
		DashCustomer c1 = new DashCustomer();
		
		//testing password
		c1.setPassword("kkkk45@");
		String i = c1.getPassword();
		assertEquals("kkkk45@", i);
		
		c1.setPassword("Pass");
		String j = c1.getPassword();
		assertEquals("Pass", j);
		
		c1.setPassword("Password90!");
		String k = c1.getPassword();
		assertEquals("Password90!", k);
		
		c1.setPassword("gh746283764");
		String l = c1.getPassword();
		assertEquals("gh746283764", l);
		
		/*
		 * Testing to see that it's okay to set any password; however, with checkId only specific id's
		 * with specific characters and length are accepted*/
		
		boolean check = c1.checkPassword(i);
		assertEquals(false, check);
		
		boolean check1 = c1.checkPassword(j);
		assertEquals(false, check1);
		
		boolean check2 = c1.checkPassword(k);
		assertEquals(true, check2);
		
		boolean check3 = c1.checkPassword(l);
		assertEquals(false, check3);
		
		
	}
	
	@Test
	void test_loadData() {
		DashCustomer client = new DashCustomer();
		
		String i_d = "bhumi16";
		String pass_word = "Password08@";
		
		boolean c1 = client.checkUserId(i_d);
		boolean c2 = client.checkPassword(pass_word);
		
		
		assertEquals(true, c1); assertEquals(true, c2);
		client.loadNewInfo(i_d, pass_word);
		
		String i_d1 = "jKl";
		String pass_word1 = "Pass45";
		
		boolean c3 = client.checkUserId(i_d1);
		boolean c4 = client.checkPassword(pass_word1);
		
		assertEquals(false, c3); assertEquals(false, c4);
		client.loadNewInfo("", "");

		
	}
	
	@Test
	void check_userName() {
		DashCustomer e1 = new DashCustomer();
		
		String i_d = "bhumi14";
		String pass_word = "Pasword78!";
		
		//checks for correct length and characters for id and password
		boolean f1 = e1.checkUserId(i_d); boolean f2 = e1.checkPassword(pass_word);
		assertEquals(true, f1); assertEquals(true, f2);
		
		//loads in the data... 
		e1.loadNewInfo(i_d, pass_word);
		
		//checks if the user-Id is found or not in dict.. return true/false
		boolean c1 = e1.checkData(i_d, pass_word);
		assertEquals(true, c1);
	}
	
	@Test
	void check_passwordName() {
		DashCustomer e2 = new DashCustomer();
		
		String i_d1 = "kaite2345";
		String pass_word1 = "Pass45code@";
		
		//checks for correct length and characters for id and password
		boolean f3 = e2.checkUserId(i_d1); boolean f4 = e2.checkPassword(pass_word1);
		assertEquals(true, f3); assertEquals(true, f4);
		
		//loads in the data...
		e2.loadNewInfo(i_d1, pass_word1);
		
		//checks if the password is found or not in dict... return true/false
		boolean c2 = e2.checkData1(i_d1, pass_word1);
		assertEquals(true, c2);
		
		
	}

	
	@Test
	void check_add_data() {
		DashCustomer e = new DashCustomer();
		
		String i_d = "bhumi16";
		String pass_word = "Password08@";
		
		boolean c1 = e.checkUserId(i_d);
		boolean c2 = e.checkPassword(pass_word);
		
		
		assertEquals(true, c1); assertEquals(true, c2);
		e.loadNewInfo(i_d, pass_word);
		
		assertEquals(true, e.checkData(i_d, pass_word));
		assertEquals(true, e.checkData1(i_d, pass_word));
		
		String i_d1 = "jKl";
		String pass_word1 = "Pass45";
		
		boolean c3 = e.checkUserId(i_d1);
		boolean c4 = e.checkPassword(pass_word1);
		
		assertEquals(false, c3); assertEquals(false, c4);
		e.loadNewInfo("", "");
		
		assertEquals(false, e.checkData(i_d1, pass_word1));
		assertEquals(false, e.checkData1(i_d1, pass_word1));
				
		
	}
	
	@Test
	void test_name() {
		DashCustomer c4 = new DashCustomer();
		
		c4.setFname("John"); c4.setLname("Doe");
		
		assertEquals("John", c4.getFname());	
		assertEquals("Doe", c4.getLname());
		
		assertEquals("John Doe", c4.getName());
			
	}
	
	@Test
	void test_customerInfo() {
		DashCustomer c5 = new DashCustomer();
		
		c5.setEmail("bhumi340@gmail.com");
		String e = c5.getEmail();
		
		assertEquals("bhumi340@gmail.com", e);
		
		
	}
	
	@Test
	void test_phone() {
		DashCustomer c6 = new DashCustomer();
		c6.setPhoneNum(510-893-5678);
		
		int num = c6.getPhoneNum();
		
		assertEquals(510-893-5678, num);
		
		
	}
	
	@Test
	void test_address() {
		Address a1 = new Address();
		a1.setStreetName("Walnut Creek");
		String a_n = a1.getStreetName();
		
		//assertEquals("Walnut", a_n);   Note: fails the test
		assertEquals("Walnut Creek", a_n);
		
		a1.setStreetNum(2395);
		int a_num = a1.getStreetNum();
		
		assertEquals(2395, a_num);
		
		a1.setCity("Hayward");
		String c = a1.getCity();
		
		//assertEquals("Fremont", c);   Note: fails the test
		assertEquals("Hayward", c);
		
		a1.setZipCode(97342);
		int z_code = a1.getZipCode();
		
		//assertEquals(9234, z_code);   Note: fails the test
		assertEquals(97342, z_code);
		
	}
	
	@Test
	void test_toString() {
		DashCustomer c7 = new DashCustomer("kira34m", "Kira", "Gomez", "k89gomez@gmail.com", true);
		
		String ans = c7.toString();
		
		String expected = "UserId: " + c7.getId() + '\n' + "Client: " + c7.getName() + '\n' + "Email: " + c7.getEmail() +
	               '\n'+ "Status: " + c7.getAccount();
		
		assertEquals(expected, ans);
		
	}
	
	@Test
	void test_addressString() {
		Address a2 = new Address();
		
		a2.setStreetName("Fremont Blvd."); a2.setStreetNum(23865); a2.setCity("Fremont"); a2.setZipCode(93281);
		
		String ans1 = a2.toString();
		
		String expected1 = "\nStreetName: " + a2.getStreetName() + "\n" + "House-Number: " + a2.getStreetNum() + "\n" + 
                "ZipCode: " + a2.getZipCode() + "\n" + "City: " + a2.getCity();
	}
	
	@Test
	void test_dictLoadcInfo() {
		
		String i_d1 = "bhumi21";
		
		String n = "Bhumi";
		String n1 = "Patel";
		String n2 = "baptel57@horizon.csueastbay.edu";
		String n3 = "93942";
		String n4 = "Hayward";
		Vector<String> v1 = new Vector<String>();
		v1.addElement(n); v1.addElement(n1); v1.addElement(n2); v1.addElement(n3); v1.addElement(n4);
		
		String expected = "User-Id: " + i_d1 + '\n' + v1.get(0) + '\t' + v1.get(1) + '\n' + v1.get(2) + '\n' + v1.get(3) + '\n' +
    			v1.get(4);
		
		DashCustomer c1 = new DashCustomer();
		c1.LoadInfo(i_d1, "Bhumi", "Patel", "baptel57@horizon.csueastbay.edu", "93942", "Hayward");
		
	
		String ans = c1.ViewInfo(i_d1);
		
		assertEquals(expected, ans);
				
	}
	
	
	
	

}

