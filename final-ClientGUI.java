//package finalProject.codejava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
						
						new ClientGUI2();
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
				Vehiclecopy vehicle1= new Vehiclecopy(); 
				Payment payment1 = new Payment();
				String fileName = "vehicleDatabase.txt";
				Vector<String> fileHistory = new Vector(3);
				File myFile = new File(fileName);
				
				
				
				
				
				
				DashCustomer c = new DashCustomer();
				Address a_c1 = new Address();
				
				if(c.checkData(u_name, p_name) && c.checkData1(u_name, p_name)) {
					//connect with the hub and allow to talk to other GUI classes like vehicle and payment
					//new Hub();
					
					JFrame frame=new JFrame("HOME PAGE");  //home page
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
					frame.getContentPane().setBackground(Color.BLACK);
					
					
					
					 //View Vehicle Info
					   JButton button1=new JButton("View Vehicles "); 
					   button1.setBounds(20,20,150,30);
					   frame.add(button1);
					   button1.addActionListener
					   (
							   new ActionListener() {
								   
								   public void actionPerformed(ActionEvent e)
								   {
									   
										
										try {
											Scanner myScanner;
											myScanner = new Scanner(myFile);
											String make;
											String model;
											String color;
											String year;
											String licensePlate;
											String cleanV;
											String axles;
											while(myScanner.hasNextLine()) {
												String workingLine = myScanner.nextLine();
												String[] readingArray = workingLine.split(",");
												if(u_name.compareTo(readingArray[0])==0) { //if the user name matches active user name
													make = readingArray[1];
													model = readingArray[2];
													color = readingArray[3];
													year = readingArray[4];
													licensePlate = readingArray[5];
													cleanV = readingArray[6];
													axles = readingArray[7];
													vehicle1.setMake(make);
													vehicle1.setModel(model);
													vehicle1.setColor(color);
													vehicle1.setYear(year);
													vehicle1.setLicense_Plate(licensePlate);
													vehicle1.setClean(cleanV);
													vehicle1.setAxles(axles);
												}
												fileHistory.add(workingLine);
											}
											myScanner.close();
										} catch (FileNotFoundException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										
									   JOptionPane.showMessageDialog(null,vehicle1.getVehicleInfo());
								   }
							   }	   
							   
					   );
					   
					   
					 //View Payment Options
					   JButton button2=new JButton("Payment Options");
					   frame.add(button2);
					   button2.setBounds(180,20,150,30);
					   button2.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								PaymentGUI paymentWindow = new PaymentGUI(payment1,u_name);
							} catch (FileNotFoundException e1) {
								
								e1.printStackTrace();
							}
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
					   JButton button4= new JButton("Add Vehicle Info");
					   frame.add(button4);
					   button4.setBounds(500,20,150,30);  
					   button4.addActionListener
					   (
							new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
									//License Plate Number
									String licensePlate= JOptionPane.showInputDialog("Enter the License Plate NUmber of your car (it should be 7 Apha-Numeric): ");
									if(vehicle1.validateLicense(licensePlate)) {
										vehicle1.setLicense_Plate(licensePlate);
									}
									else {
										JOptionPane.showMessageDialog(null,"Invalid number characters \n Skipping ");
									}
									
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
										JOptionPane.showMessageDialog(null,"Invalid number of pair of axles.\n Skipping");
									}
									
									boolean clean= Boolean.parseBoolean(JOptionPane.showInputDialog("Is your Vehicle clean?(true/false): "));
									
									
									vehicle1.setVehicleInfo(u_name,compname,model,year,color,licensePlate, clean, 1, num);
									
									File fnew=new File(fileName);
									FileWriter fWriter;
									
									
										try {
											fWriter = new FileWriter(fnew, false);
											for(int i = 0 ; i<fileHistory.size(); i++) {
												fWriter.write(fileHistory.elementAt(i)+"\n");
											}
											fWriter.write(u_name+","+compname+","+model+","+color+","+year+","+licensePlate+","+clean+","+num+"\n");
											fWriter.close();
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
		
									JOptionPane.showMessageDialog(null,"Changes Saved!");
								}
							}
							   
					   );
					   
					   JButton button5=new JButton("Delete Vehicle");
					   frame.add(button5);
					   button5.setBounds(150,60,150,30); 
					   vehicle1.deleteVehicle();
					   
					   JButton button6 = new JButton("Edit Personal Info");
					   frame.add(button6);
					   button6.setBounds(450,60,150,30);
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
					   
					   
					   JButton button8=new JButton("Sign Out");
					   frame.add(button8);
					   
					   button8.setBounds(300, 110, 150, 30);
					   button8.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							JFrame n_f = new JFrame();
							n_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							
							JOptionPane.showMessageDialog(n_f, "Thank you for visiting FastTrak", "Log Out", JOptionPane.INFORMATION_MESSAGE);							
							
						}
						   
					   });
					   
					   frame.setSize(750,200);
					   frame.setLocationRelativeTo(null);
					   frame.setLayout(null);  
					   frame.setVisible(true);
					
					
				}
				
				else {
					//Add a JOptionPane showmessageDialogue...
					
					JFrame alert_f = new JFrame();
					JOptionPane.showMessageDialog(alert_f, "INVALID INFO!! TRY AGAIN", "Error Message", JOptionPane.ERROR_MESSAGE);
					
					
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


