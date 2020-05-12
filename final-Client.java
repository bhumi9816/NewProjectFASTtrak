//package finalProject.codejava;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		
		DashCustomer c1 = new DashCustomer();

		System.out.println("Welcome to FastTrak");

 //stimulated database keeping track of all the usernames & passwords
		Dictionary<String, String> customerLoginInfo = new Hashtable<String, String>();
		
		
//stimulated database keeping track of all client info using an array
		Dictionary<String, List<String>> customerInfo = new Hashtable<String, List<String>>();

        //asking for Login or Create Account
        Scanner status = new Scanner(System.in);  
        Scanner status1 = new Scanner(System.in);
        
        System.out.println("Press L to Login OR C to Create Account: ");
        String choice = status.nextLine();

        //current customer Log-in Page
        
        if(choice.equals("L")){
        	LoginInfo(customerLoginInfo, c1);
                         
        } 
        

        //new customer
        else if(choice.equals("C")){
        	
        	System.out.println("First name: ");
            String first_n = status.nextLine();

            System.out.println("Last name: " );
            String last_n = status.nextLine();

            System.out.println("\nAddress ");
            System.out.println("Street number/Apt number: ");
            int street_num = status1.nextInt();

            System.out.println("Street Name: ");
            String street_n = status.nextLine();

            System.out.println("City: ");
            String city = status.nextLine();

            System.out.println("ZipCode: ");
            int zip_c = status1.nextInt();

            System.out.println("Email: ");
            String email = status.nextLine();

           System.out.println("\nLogin Info");
           System.out.println("Username: " );
           String u_name = status.nextLine();
           

           System.out.println("Password: " );
           String p = status.nextLine();
            

           c1 = new DashCustomer(u_name, first_n, last_n, email, true);

           //adding to the dictionary
           customerLoginInfo.put(u_name, p);
           System.out.println("Password is " + customerLoginInfo.get(u_name));
           
           //Going Back to the Login Page
           System.out.println("\n \t\tWelcome to LOGIN Page\n");
           LoginInfo(customerLoginInfo, c1);
           
           
           	
           //Once the userId and Password matches the stimulated Database, takes us to the HomePage
           
           /*Note: Code needs to be implemented that will search through the stimulated database to find the correct
            * client with the given ID and password*/
       	   
           
        }
        
        System.out.println("HOME_PAGE");
		
        System.out.println("Choose from the below OPTIONS");
     	        		
        System.out.println("A. VehicleInfo\t B. ADD PaymentInfo\t C. EDIT\t D. VIEW CUSTOMER INFO");
        
        String ans = status.nextLine();
        
        if(ans.equals("A")) {
        	
        	
        	
        }
        
        status.close();
        status1.close();

	}
	
	public static void LoginInfo(Dictionary<String, String> cInfo, DashCustomer c) {
		
		
		Scanner status = new Scanner(System.in);  
        Scanner status1 = new Scanner(System.in);
		
		System.out.println("Enter UserId: ");
        String customer_id = status.nextLine();

        boolean checkId = c.checkUserId(customer_id);
        

        while(checkId != true) {
        	System.out.println("Error!!");
        	
        	System.out.println("Enter Valid UserId: ");
            customer_id = status.nextLine();

            checkId = c.checkUserId(customer_id);
        	
        }
        
        System.out.println("Correct ID");
      

        System.out.println("Enter Password: ");
        String customer_password = status.nextLine();

        boolean checkPassword = c.checkPassword(customer_password);
        
        while(checkPassword != true) {
        	System.out.println("Error!!");
        	
        	System.out.println("Enter Valid Password: ");
            customer_password = status.nextLine();

            checkPassword = c.checkPassword(customer_password);
        	
        }

    
        System.out.println("Correct Password");
        
        status.close();
    	status1.close();
		
	}
	
	
	
	

}
