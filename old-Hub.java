package finalProject.codejava;

import java.awt.Color;
import java.awt.event.*; 
import javax.swing.*;

public class Hub extends JFrame implements ActionListener {
	
	
	public Hub() {
		
		JFrame frame=new JFrame("HOME PAGE");  //home page
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().setBackground(Color.BLACK);
		
		DashCustomer c1 = new DashCustomer();
		
		Address a_c1 = new Address();
		
		Vehiclecopy vehicle1= new Vehiclecopy(); 
		
		Payment payment1 = new Payment();
		
		 //View Vehicle Info
		   JButton button1=new JButton("View Vehicles "); 
		   button1.setBounds(20,20,150,30);
		   frame.add(button1);
		   button1.addActionListener
		   (
				   new ActionListener() {
					   public void actionPerformed(ActionEvent e)
					   {
						   JOptionPane.showMessageDialog(null,vehicle1.getVehicleInfo());
					   }
				   }	   
				   
		   );
		   
		   
		   //View Balance
		   JButton button2=new JButton("View Balance ");
		   frame.add(button2);
		   button2.setBounds(180,20,150,30);
		   button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				//View Balance
				JOptionPane.showMessageDialog(null,payment1.getCardInfo());
							
				
			}
			   
		   });
		   
		   JButton button3=new JButton("View Personal Info ");
		   frame.add(button3);
		   button3.setBounds(340,20,150,30); 
		   button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//View personal info
				
				JOptionPane.showMessageDialog(null,c1.toString());
							
			}
			   
		   });
		   
		   //Add/Edit Vehicle Info
		   JButton button4= new JButton("Edit Vehicle Info");
		   frame.add(button4);
		   button4.setBounds(500,20,200,30);  
		   button4.addActionListener
		   (
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						//License Plate Number
						String licensePlate= JOptionPane.showInputDialog("Enter the License Plate NUmber of your car (it should be 7 Apha-Numeric): ");
						vehicle1.setLicense_Plate(licensePlate);
						
						//company name
						String compname=JOptionPane.showInputDialog("Enter the company name of the car: ");
						vehicle1.setMake(compname);
						
						//model of the car
						String model= JOptionPane.showInputDialog("Enter the model of your car: ");
						//vehicle1.set;
						
						int year= Integer.parseInt(JOptionPane.showInputDialog("Enter the year of your car: "));
						
						
						String color= JOptionPane.showInputDialog("Enter the color of the car: ");
						
						int num= Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pair of axles of your car, to know the size of your car (atleast two pairs): "));
						if(num<2)
						{
							JOptionPane.showMessageDialog(null,"Invalid number of pair of axles. Please enter a number more than 2. ");
							num=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pair of axles of your car, to know the size of your car (atleast two pairs): "));
						}
						
						boolean clean= Boolean.parseBoolean(JOptionPane.showInputDialog("Is your Vehicle clean?(true/false): "));
						
						
						vehicle1.setVehicleInfo("19445",compname,model,year,color,licensePlate, clean, 1, num);
						
						
					}
				}
				   
		   );
		   
		   JButton button5=new JButton("Delete");
		   frame.add(button5);
		   button5.setBounds(150,60,150,30); 
		   
		   vehicle1.deleteVehicle();
		   
		   JButton button6 = new JButton("Edit Personal Info");
		   frame.add(button6);
		   button6.setBounds(270,60,150,30);
		   button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//First Name
				String f_name = JOptionPane.showInputDialog("Enter First Name: ");
				c1.setFname(f_name);
				
				//Last Name
				String l_name =JOptionPane.showInputDialog("Enter Last Name: ");
				c1.setLname(l_name);
				
				//Email
				String e_mail = JOptionPane.showInputDialog("Enter email: ");
				c1.setEmail(e_mail);
				
				//phone number
				String p = JOptionPane.showInputDialog("Enter phone-number: ");
				c1.setPhoneNum(Integer.parseInt(p));
				
				//Address-Street Name
				String a_sname = JOptionPane.showInputDialog("Enter Street Name:  ");
				a_c1.setStreetName(a_sname);
				
				//Address-Street Num
				String a_snum = JOptionPane.showInputDialog("Enter Street Num/Apt: ");
				a_c1.setStreetNum(Integer.parseInt(a_snum));
				
				//Zip-code
				String a_zip = JOptionPane.showInputDialog("Enter Zip-Code: ");
				a_c1.setZipCode(Integer.parseInt(a_zip));
				
								
				
			}
			   
		   });
		   
		   JButton button7 = new JButton("Edit Payment Info");
		   frame.add(button7);
		   button7.setBounds(550,60,150,30);
		   button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Edit credit card info
				JButton buttonEditInfo = new JButton("Edit Credit Card Info"); //Create instance for Edit info
				buttonEditInfo.setBounds(130, 100, 300, 30); //Set size
				frame.add(buttonEditInfo); //Add button to JFrame
				buttonEditInfo.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent event) {
								// Request the credit card name
								String creditCardName = JOptionPane.showInputDialog("Enter credit card number name");
								payment1.setCardName(creditCardName);
								
								// Request the credit card number
								String creditCardNum = JOptionPane.showInputDialog("Enter credit card number (16 digits)");
								if (payment1.validateCreditCardNumber(creditCardNum)) {
									payment1.setCardNum(creditCardNum);
								}
								else{
									JOptionPane.showMessageDialog(null, "Invalid credit card number. Skipping.");
								}
								
								// Request the credit card exp date
								String creditCardExp = JOptionPane.showInputDialog("Enter expiration date (Follow format 4/20 => 042020)");
								if (payment1.validateExpDate(creditCardExp)) {
									payment1.setExpDate(creditCardExp);
								}
								else{
									JOptionPane.showMessageDialog(null, "Invalid Expiration Date. Skipping.");
								}
								
								// Request the ccv
								String creditCardCCV = JOptionPane.showInputDialog("Enter CCV (3 digits)");
								if (payment1.validateCCV(creditCardCCV)) {
									payment1.setCCV(creditCardCCV);
								}
								else{
									JOptionPane.showMessageDialog(null, "Invalid CCV. Skipping.");
								}
								
								JOptionPane.showMessageDialog(null, "Successfully Edited Credit Card Details");
							}
						}
				);
				
				//Delete credit card info 
				JButton buttonDelInfo = new JButton("Delete Credit Card Info"); //Create instance for Delete info
				buttonDelInfo.setBounds(130, 100, 300, 30); //Set size
				frame.add(buttonDelInfo); //Add button to JFrame
				buttonDelInfo.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent event) {
								JOptionPane.showMessageDialog(null, payment1.deleteCardInfo());
							}
						}
				);
				
				//Add Funds
				JButton buttonAddFunds = new JButton("Add Funds to Account"); //Create instance for Add Funds
				buttonAddFunds.setBounds(130, 100, 300, 30); //Set size
				frame.add(buttonAddFunds); //Add button to JFrame
				buttonAddFunds.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent event) {
								String reloadAmount = JOptionPane.showInputDialog("How much would you like to load? ");
								JOptionPane.showMessageDialog(null, "Adding $" + reloadAmount + " to Account Balance");
								payment1.loadAccount(reloadAmount);
							}
						}
				);
				
				//Simulate Charge
				JButton buttonSimulate = new JButton("Simulate Charge"); //Create instance for Simulate
				buttonSimulate.setBounds(130, 100, 300, 30); //Set size
				frame.add(buttonSimulate); //Add button to JFrame
				buttonSimulate.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent event) {
								JOptionPane.showMessageDialog(null, payment1.receiveCharge());
							}
						}
				);
				
				//Transaction History
				JButton buttonHistory = new JButton("See Transaction History"); //Create instance for History
				buttonHistory.setBounds(130, 100, 300, 30); //Set size
				frame.add(buttonHistory); //Add button to JFrame	
				buttonHistory.addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent event) {
								JOptionPane.showMessageDialog(null, payment1.getTransactionHistory());
							}
						}
				);
				
			}
			   
		   });
	
		   
		   JButton button8=new JButton("Sign Out");
		   frame.add(button8);
		   button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame n_f = new JFrame("LogOut Window");
				
			}
			   
		   });
		   //button6.setBounds(350,60,150,30);

		   
		   frame.setSize(800,200);
		   frame.setLocationRelativeTo(null);
		   frame.setLayout(null);  
		   frame.setVisible(true); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
