package finalProject.codejava;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		
		DashCustomer c = new DashCustomer();

		System.out.println("Welcome to FastTrak");

        Dictionary<String, String> customerInfo = new Hashtable<String, String>();

        //asking for Login or Create Account
        Scanner status = new Scanner(System.in);
        System.out.println("Press L to Login OR C to Create Account: ");
        String choice = status.nextLine();

        //current customer
        if(choice.equals("L")){
            System.out.println("Enter UserId: ");
            String customer_id = status.nextLine();

            boolean checkId = c.checkUserId(customer_id);

 //Note: make change later: to make while loop and go on till we get a correct uerId
            if(checkId == true){
                System.out.println("correct id");

            }
            else{
                System.out.println("incorrect id");
            }

            System.out.println("Enter Password: ");
            String customer_password = status.nextLine();

            boolean checkPassword = c.checkPassword(customer_password);

            if(checkPassword == true){
                System.out.println("correct password");
                System.out.println("A. ADD Vehicle\t B. ADD PaymentInfo\t C. EDIT");
                String ans = status.nextLine();
            }

            else{
                System.out.println("incorrect password");
            }

        } 

        //new customer
        else if(choice.equals("C")){
            System.out.println("First name: ");
            String first_n = status.nextLine();

            System.out.println("Enter your last name: " );
            String last_n = status.nextLine();

            System.out.println("\nAddress ");
            System.out.println("Street number/Apt number: ");
            int street_num = status.nextInt();

            System.out.println("Street Name: ");
            String street_n = status.nextLine();

            System.out.println("City: ");
            String city = status.nextLine();

            System.out.println("ZipCode: ");
            int zip_c = status.nextInt();

            System.out.println("Email: ");
            String email = status.nextLine();

           System.out.println("\nLogin Info");
           System.out.println("Username: " );
           String u_name = status.nextLine();

           System.out.println("Password: " );
           String p = status.nextLine();

           c = new DashCustomer(u_name, first_n, last_n, email, true);

           //adding to the dictionary
           customerInfo.put(u_name, p);

           System.out.println("\nCustomer Info: ");
           System.out.println(c.toString());
        }
        status.close();

	}
	
	

}
