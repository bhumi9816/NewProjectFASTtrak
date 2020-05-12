package finalProject.codejava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class ClientGUI extends Payment implements ActionListener {
	
	JButton b1, b2;
	JTextField ans, ans1;
	
	public static void main(String[] args) {
		new ClientGUI();
	}
	
	public ClientGUI() {
		
		//Setting up the Welcome Page
		JFrame f = new JFrame("FASTRAK");
		f.getContentPane().setBackground(Color.BLACK);
		
		JLabel l; 
		
		
		l = new JLabel("Welcome To FASTRAK", SwingConstants.CENTER);
		l.setFont(new Font("Serif", Font.BOLD, 24));
		l.setForeground(Color.pink);
		l.setBounds(95, -10, 300, 200);
		
		
		//sign-in buttons with ActionListeners 'Login' and 'Create Account'
		
		//Log-in: existing customers signing in to their accounts
		
		b1 = new JButton("Login");
		b1.setBounds(100, 132, 93, 30);
		
		//once the button is clicked switches to 'Log-in frame'
		b1.addActionListener(this);
		
		
		//Create Account: new customers, providing necessary information
		
		b2 = new JButton("Create Account");
		b2.setBounds(250, 132, 150, 30);
		
		//new Account frame
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f2 = new JFrame("New Account");
				f2.getContentPane().setBackground(Color.BLACK);
				
				JLabel f, l, a_sName, a_sNum, c, z, phone, email;
				
				JTextField f_name, l_name, a_s1, a_s2, city, zip_code, cell_phone, e_mail;
				
				//First Name
				f = new JLabel("First Name: ");
				f.setFont(new Font("Serif", Font.BOLD, 13));
				f.setForeground(Color.GREEN);
				f.setBounds(110, 2, 100, 100);
				
				//text field to input info
				f_name = new JTextField();
				f_name.setBounds(100, 70, 102, 20);
				
				//Last Name
				l = new JLabel("Last Name: ");
				l.setFont(new Font("Serif", Font.BOLD, 13));
				l.setForeground(Color.GREEN);
				l.setBounds(110, 75, 100, 100);
				
				//text field to input info
				l_name = new JTextField();
				l_name.setBounds(100, 140, 102, 20);
				
				//Address: Street Name
				a_sName = new JLabel("Address 1: Street Name");
				a_sName.setFont(new Font("Serif", Font.BOLD, 13));
				a_sName.setForeground(Color.GREEN);
				a_sName.setBounds(110, 185, 152, 20);
				
				//text field to input info
				a_s1 = new JTextField();
				a_s1.setBounds(100, 210, 160, 20);
				
				//Extra space for address:
				JTextField a_s11 = new JTextField();
				a_s11.setBounds(100, 240, 140, 20);
				
				//Address Line: StreetNumber or AptNumber
				a_sNum = new JLabel("Address 2: Street Num/Apt Num");
				a_sNum.setFont(new Font("Serif", Font.BOLD, 13));
				a_sNum.setForeground(Color.GREEN);
				a_sNum.setBounds(110, 285, 190, 20);
				
				a_s2 = new JTextField();
				a_s2.setBounds(100, 315, 150, 20);
				
				//City
				c = new JLabel("City: ");
				c.setFont(new Font("Serif", Font.BOLD, 13));
				c.setForeground(Color.GREEN);
				c.setBounds(110, 355, 102, 20);
				
				city = new JTextField();
				city.setBounds(100, 380, 100, 20);
				
				//Zip-Code
				z = new JLabel("Zip Code: ");
				z.setFont(new Font("Serif", Font.BOLD, 13));
				z.setForeground(Color.GREEN);
				z.setBounds(110, 425, 102, 20);
				
				zip_code = new JTextField();
				zip_code.setBounds(100, 455, 102, 20);
				
				//Cell-Phone
				phone = new JLabel("Cell-Phone: ");
				phone.setFont(new Font("Serif", Font.BOLD, 13));
				phone.setForeground(Color.GREEN);
				phone.setBounds(110, 495, 102, 20);
				
				cell_phone = new JTextField();
				cell_phone.setBounds(100, 522, 102, 20);
				
				//Email
				email = new JLabel("Email: ");
				email.setFont(new Font("Serif", Font.BOLD, 13));
				email.setForeground(Color.GREEN);
				email.setBounds(110, 562, 102, 20);
				
				e_mail = new JTextField();
				e_mail.setBounds(100, 590, 132, 20);
				
				JButton n = new JButton("Next");
				n.setBounds(100, 629, 102, 20);
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(f_name.getText().isEmpty() && l_name.getText().isEmpty() && a_s1.getText().isEmpty() &&
								a_s2.getText().isEmpty() && city.getText().isEmpty() && zip_code.getText().isEmpty() &&
								cell_phone.getText().isEmpty() && e_mail.getText().isEmpty()) {
							
							//add JOption Pane to show error message
							System.out.println("Enter valid Info");
						}
							
						JFrame n_1 = new JFrame("Create Account");
						n_1.getContentPane().setBackground(Color.BLACK);
						
						//setting up client username
						JLabel u = new JLabel("Username: ");
						u.setFont(new Font("Serif", Font.BOLD, 13));
						u.setForeground(Color.GREEN);
						u.setBounds(110, 20, 102, 20);
						
						JTextField user = new JTextField();
						user.setBounds(100, 55, 112, 20);
						
						
						//setting up client password
						JLabel p = new JLabel("Password: ");
						p.setFont(new Font("Serif", Font.BOLD, 13));
						p.setForeground(Color.GREEN);
						p.setBounds(110, 92, 102, 20);
						
						JTextField pass = new JTextField();
						pass.setBounds(100, 120, 112, 20);
						
						/*
						 * instantiating Client Object and setting up the added information
						 * and adding the info t stimulated dictionary*/
						
						DashCustomer client = new DashCustomer(user.getText(), f_name.getText(), l_name.getText(),
								e_mail.getText(), true);
						
						client.loadData(user.getText(), pass.getText());
						
						
						
						JButton next1 = new JButton("Next");
						next1.setBounds(100, 170, 102, 20);
						next1.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								if(user.getText().isEmpty() && pass.getText().isEmpty()
										&& client.checkUserId(user.getText()) && client.checkPassword(pass.getText())) {
									System.out.println("Input Valid Info");
									
								}
								
								else {
									new VehicleGUI();
									
									
								}
								
								
							}
							
						});
								
						
						//adding username and password labels/textfields
						n_1.add(u); n_1.add(p);
						n_1.add(user); n_1.add(pass);
						n_1.add(next1);
												
						
						n_1.setSize(350, 300);
						n_1.setLayout(null);
						n_1.setLocationRelativeTo(null);
						n_1.setVisible(true);
						
					}
					
				});
				
				
				//adding labels to frame
				f2.add(f); f2.add(l); f2.add(a_sName); f2.add(a_sNum); f2.add(c);
				f2.add(z); f2.add(phone); f2.add(email); 
				
				//adding text-fields to frame
				f2.add(f_name); f2.add(l_name); f2.add(a_s1); f2.add(a_s11); f2.add(a_s2); f2.add(city);
				f2.add(zip_code); f2.add(cell_phone); f2.add(e_mail); 
				
				//adding 'next' button to frame
				f2.add(n);
				
				f2.setSize(370, 750);
				f2.setLayout(null);
				f2.setLocationRelativeTo(null);
				f2.setVisible(true);				
				
				
			}
			
		});
		
		
		
		f.add(l);
		f.add(b1);
		f.add(b2);
		
		
		f.setSize(500, 350);
		f.setLayout(null);
		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		//Login Option
		
		JFrame f1 = new JFrame("Login Page");
		
		f1.getContentPane().setBackground(Color.black);
		
		
		JLabel user_name = new JLabel("Username ");
		user_name.setFont(new Font("Serif", Font.BOLD, 18));
		user_name.setForeground(Color.GREEN);
		user_name.setBounds(110, 2, 100, 100);
		
		ans = new JTextField();
		ans.setBounds(100, 70, 95, 20);
		
		
		JLabel password = new JLabel("Password ");
		password.setFont(new Font("Serif", Font.BOLD, 18));
		password.setForeground(Color.GREEN);
		password.setBounds(110, 97, 100, 100);
		
		ans1 = new JTextField();
		ans1.setBounds(100, 165, 95, 20);
		
		JButton click = new JButton("login");
		click.setBounds(105, 230, 85, 20);
		click.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				String u_name = ans.getText();			
				String p_name = ans1.getText();
				
				DashCustomer c = new DashCustomer();
				Address a_c1 = new Address();
				
				if(c.checkData(u_name, p_name)) {
					//connect with the hub and allow to talk to other GUI classes like vehicle and payment
					//new Hub();
					
					JFrame frame=new JFrame("HOME PAGE");  //home page
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
					frame.getContentPane().setBackground(Color.BLACK);
					
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
							JOptionPane.showMessageDialog(null, c.ViewInfo(u_name));						
										
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
					   
					   //Note: instead of vehicle making a delete button that deletes all info associated with the id
					   vehicle1.deleteVehicle();
					   
					   JButton button6 = new JButton("Edit Personal Info");
					   frame.add(button6);
					   button6.setBounds(350,60,150,30);
					   button6.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							//First Name
							String f_name = JOptionPane.showInputDialog("Enter First Name: ");
							c.setFname(f_name);
							
							//Last Name
							String l_name =JOptionPane.showInputDialog("Enter Last Name: ");
							c.setLname(l_name);
							
							//Email
							String e_mail = JOptionPane.showInputDialog("Enter email: ");
							c.setEmail(e_mail);
							
							//phone number
							String p = JOptionPane.showInputDialog("Enter phone-number: ");
							c.setPhoneNum(Integer.parseInt(p));
							
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
							
							n_f.setSize(200, 200);
							n_f.setLayout(null);
							n_f.setLocationRelativeTo(null);
							n_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							n_f.setVisible(true);
							
						}
						   
					   });
					   
					   frame.setSize(800,200);
					   frame.setLocationRelativeTo(null);
					   frame.setLayout(null);  
					   frame.setVisible(true);
					
					
				}
				
				else {
					//Add a JOptionPane showmessageDialogue...
					System.out.println("Invalid Info");
					
				}
				
			}
			
		});
		
		
		f1.add(user_name); f1.add(password); f1.add(ans); f1.add(ans1);
		
		//next button
		f1.add(click);
	
		f1.setSize(300, 300);
		f1.setLayout(null);
		
		f1.setLocationRelativeTo(null);
		f1.setVisible(true);
			
		
	}
	
	

}


