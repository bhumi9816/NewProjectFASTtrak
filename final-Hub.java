//package finalProject.codejava;

import java.awt.Color;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class Hub extends JFrame implements ActionListener {
	
	
	public Hub(DashCustomer c1, Vehiclecopy v1, Payment p1) {
		
		JFrame frame=new JFrame("HOME PAGE");  //Home Page
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().setBackground(Color.BLACK);
		
		Address a_c1 = new Address();
		
		 //View Vehicle Info
		   JButton button1=new JButton("View Vehicles "); 
		   button1.setBounds(20,20,150,30);
		   frame.add(button1);
		   button1.addActionListener
		   (
				   new ActionListener() {
					   public void actionPerformed(ActionEvent e)
					   {
						   JOptionPane.showMessageDialog(null,v1.getVehicleInfo());
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
					PaymentGUI paymentWindow = new PaymentGUI(p1,c1.getId());
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
				JOptionPane.showMessageDialog(null,c1.toString());
							
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
						v1.setLicense_Plate(licensePlate);
						
						//company name
						String compname=JOptionPane.showInputDialog("Enter the name of the car: ");
						v1.setMake(compname);
						
						//model of the car
						String model= JOptionPane.showInputDialog("Enter the model of your car: ");
						
						
						int year= Integer.parseInt(JOptionPane.showInputDialog("Enter the year of your car: "));
						
						
						String color= JOptionPane.showInputDialog("Enter the color of the car: ");
						
						int num= Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pair of axles of your car, to know the size of your car (atleast two pairs): "));
						if(num<2)
						{
							JOptionPane.showMessageDialog(null,"Invalid number of pair of axles. Please enter a number more than 2. ");
							num=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pair of axles of your car, to know the size of your car (atleast two pairs): "));
						}
						
						boolean clean= Boolean.parseBoolean(JOptionPane.showInputDialog("Is your Vehicle clean?(true/false): "));
						
						
						v1.setVehicleInfo(c1.getId(),compname,model,year,color,licensePlate, clean, 1, num);
						
						
					}
				}
				   
		   );
		   
		   JButton button5=new JButton("Delete");
		   frame.add(button5);
		   button5.setBounds(150,60,150,30); 
		   button5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					//View personal info				
					v1.deleteVehicle();
								
				}
				   
		   });
		   
		   
		   JButton button6 = new JButton("Edit Personal Info");
		   frame.add(button6);
		   button6.setBounds(450,60,150,30);
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

	
		   
		   JButton button8=new JButton("Sign Out");
		   frame.add(button8);
		   button8.setBounds(300, 110, 150, 30);
		   button8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame n_f = new JFrame("LogOut Window");
				
				//add sign out ...
				
			}
			   
		   });

		   
		   frame.setSize(750,200);
		   frame.setLocationRelativeTo(null);
		   frame.setLayout(null);  
		   frame.setVisible(true); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
