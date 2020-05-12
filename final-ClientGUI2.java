//package finalProject.codejava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClientGUI2 {
	
	JTextField f_name, l_name, a_s1, a_s2, city, zip_code, cell_phone, e_mail;
	JTextField user; JTextField pass;
	JTextField m, model, y, l_plate, c_1, a;
	JTextField c_name, c_num, exp_d, cvv;
	
	DashCustomer client; Payment payInfo; Vehiclecopy v1;
	

	public ClientGUI2() {
		
		JFrame f2 = new JFrame("New Account");
		f2.getContentPane().setBackground(Color.BLACK);
		
		JLabel f, l, a_sName, a_sNum, c, z, phone, email;
							
		
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
		
		//Extra space for address: N/A if not using to write
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
				
				if(f_name.getText().isEmpty() || l_name.getText().isEmpty() ||
						a_s1.getText().isEmpty() || city.getText().isEmpty() || 
						zip_code.getText().isEmpty() || cell_phone.getText().isEmpty() || e_mail.getText().isEmpty()) {
					
					JFrame alert_f7 = new JFrame();
					JOptionPane.showMessageDialog(alert_f7, "ENTER Valid Information", "Error Message", JOptionPane.ERROR_MESSAGE);
					
					return;
				}
							
				JFrame n_1 = new JFrame("Create Account");
				n_1.getContentPane().setBackground(Color.BLACK);
				
				//setting up client username
				JLabel u = new JLabel("Username: ");
				u.setFont(new Font("Serif", Font.BOLD, 13));
				u.setForeground(Color.GREEN);
				u.setBounds(110, 20, 102, 20);
				
				user = new JTextField();
				user.setBounds(100, 55, 102, 20);
				
				
				//setting up client password
				JLabel p = new JLabel("Password: ");
				p.setFont(new Font("Serif", Font.BOLD, 13));
				p.setForeground(Color.GREEN);
				p.setBounds(110, 92, 102, 20);
				
				pass = new JTextField();
				pass.setBounds(100, 120, 112, 20);
				
				/*
				 * instantiating Client Object and setting up the added information
				 * and adding the info t stimulated dictionary*/
				
				client = new DashCustomer(user.getText(), f_name.getText(), l_name.getText(),
						e_mail.getText(), true);
				
				//loading the new client data to the stimulated dictionary
				client.loadNewInfo(user.getText(), pass.getText());
				
				//loading personal client Info to the stimulated dictionary
				client.LoadInfo(user.getText(), f_name.getText(), l_name.getText(), e_mail.getText(), zip_code.getText(), city.getText());
												
				
				JButton next1 = new JButton("Next");
				next1.setBounds(100, 170, 102, 20);
				next1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(user.getText().isEmpty() && pass.getText().isEmpty()) {
							
							JFrame alert_f3 = new JFrame();
							JOptionPane.showMessageDialog(alert_f3, "INVALID INFO!! TRY AGAIN", "Error Message", JOptionPane.ERROR_MESSAGE);
							
						}
						
						if(client.checkUserId(user.getText()) == false || client.checkPassword(pass.getText()) == false) {
							JFrame alert_f4 = new JFrame();
							JOptionPane.showMessageDialog(alert_f4, "ENTER Valid ID and PASSWORD", "Error Message", JOptionPane.ERROR_MESSAGE);
						}
						
						else {
							/* VEHICLE INFO: */
							
							
							JFrame Vehicle_info = new JFrame("Vehicle_Info");
							Vehicle_info.getContentPane().setBackground(Color.BLACK);
							
							/* 
							 * adding JLabels and TextFields for getting Vehicle Info */
							JLabel v_make, v_model, v_year, v_license_plate, v_color, v_axles;
							
							
							v_make = new JLabel("Vehicle Make: ");
							v_make.setFont(new Font("Serif", Font.BOLD, 13));
							v_make.setForeground(Color.GREEN);
							v_make.setBounds(40, 2, 100, 100);
							
							m = new JTextField();
							m.setBounds(140, 43, 140, 20);
							
							v_model = new JLabel("Vehicle Model: ");
							v_model.setFont(new Font("Serif", Font.BOLD, 13));
							v_model.setForeground(Color.GREEN);
							v_model.setBounds(40, 45, 100, 100);
							
							model = new JTextField();
							model.setBounds(140, 83, 140, 20);
							
							v_year = new JLabel("Year: ");
							v_year.setFont(new Font("Serif", Font.BOLD, 13));
							v_year.setForeground(Color.GREEN);
							v_year.setBounds(40, 88, 100, 100);
							
							y = new JTextField();
							y.setBounds(140, 123, 140, 20);
							
							v_license_plate = new JLabel("License Plate# \n(7 Alpha-Numerical): ");
							v_license_plate.setFont(new Font("Serif", Font.BOLD, 13));
							v_license_plate.setForeground(Color.GREEN);
							v_license_plate.setBounds(40, 121, 100, 100);
							
							l_plate = new JTextField();
							l_plate.setBounds(140, 163, 140, 20);
							
							v_color = new JLabel("Vehicle Color: ");
							v_color.setFont(new Font("Serif", Font.BOLD, 13));
							v_color.setForeground(Color.GREEN);
							v_color.setBounds(40, 164, 100, 100);
							
							c_1 = new JTextField();
							c_1.setBounds(140, 203, 140, 20);
							
							v_axles = new JLabel("No. of Axles: ");
							v_axles.setFont(new Font("Serif", Font.BOLD, 13));
							v_axles.setForeground(Color.GREEN);
							v_axles.setBounds(40, 207, 100, 100);
							
							a = new JTextField();
							a.setBounds(140, 243, 140, 20);
							
							
							JButton n1 = new JButton("Next");
							n1.setBounds(140, 295, 100, 20);
							n1.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									//checking if the vehicle fields are not empty
									
									if(m.getText().isEmpty() && model.getText().isEmpty() && y.getText().isEmpty() && 
											l_plate.getText().isEmpty() && c_1.getText().isEmpty() && a.getText().isEmpty()) {
										
										JFrame alert_f2 = new JFrame();
										JOptionPane.showMessageDialog(alert_f2, "INVALID INFO!! TRY AGAIN", "Error message", JOptionPane.ERROR_MESSAGE);
												
									}
									
									if(l_plate.getText().length() != 7) {
										
										System.out.println("Not Enough Characters");
										
										JFrame alert_f1 = new JFrame();
										JOptionPane.showMessageDialog(alert_f1, "Enter VALID 7-Character Liscense Plate Number", "Error message", JOptionPane.ERROR_MESSAGE);
									}
									
									else {
										
										//creating Vehicle object and passing Vehicle info in the constructor
										
										v1 = new Vehiclecopy(m.getText(), model.getText(), Integer.parseInt(y.getText()),
												l_plate.getText(), c.getText(), Integer.parseInt(a.getText()));
										
										/* PAYMENT INFO */
										
										JFrame payment = new JFrame("Payment Info");
										payment.getContentPane().setBackground(Color.BLACK);
										
										JLabel cardName, cardNumber, expire_date, CVV;
										
										
										
										cardName = new JLabel("Bank Name: ");
										cardName.setFont(new Font("Serif", Font.BOLD, 13));
										cardName.setForeground(Color.GREEN);
										cardName.setBounds(20, 2, 180, 100);
										
										c_name = new JTextField();
										c_name.setBounds(220, 43, 220, 20);
										
										cardNumber = new JLabel("(16-digit) Card Number: ");
										cardNumber.setFont(new Font("Serif", Font.BOLD, 13));
										cardNumber.setForeground(Color.GREEN);
										cardNumber.setBounds(20, 45, 180, 100);
										
										c_num = new JTextField();
										c_num.setBounds(220, 83, 220, 20);
										
										expire_date = new JLabel("Expire Date: ");
										expire_date.setFont(new Font("Serif", Font.BOLD, 13));
										expire_date.setForeground(Color.GREEN);
										expire_date.setBounds(20, 88, 180, 100);
										
										exp_d = new JTextField();
										exp_d.setBounds(220, 123, 220, 20);
										
										CVV = new JLabel("CVV: ");
										CVV.setFont(new Font("Serif", Font.BOLD, 13));
										CVV.setForeground(Color.GREEN);
										CVV.setBounds(20, 121, 180, 100);
										
										cvv = new JTextField();
										cvv.setBounds(220, 163, 220, 20);
										
										JButton b2 = new JButton("Finish");
										b2.setBounds(180, 210, 100, 20);
										b2.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent e) {
												if(c_name.getText().isEmpty() && c_num.getText().isEmpty() && exp_d.getText().isEmpty() &&
														cvv.getText().isEmpty()) {
													
													//add JOptionPane 
													System.out.println("Enter Valid Input");
												}
												
												if(c_num.getText().length() != 16 && cvv.getText().length() != 3) {
													
													//add JOption Pane
													System.out.println("Invalid Input");
												}
												
												else {
													
													//creating Payment object and passing all info to the constructor
													payInfo = new Payment(c_name.getText(), c_num.getText(), exp_d.getText(), cvv.getText());
													
													//open the Hub and connect with all classes
													new Hub(client, v1, payInfo);
												}
												
											}
											
										});
										
									
										
										//adding labels and textField to frames
										payment.add(cardName); payment.add(cardNumber); payment.add(expire_date); payment.add(CVV);
										
										payment.add(c_name); payment.add(c_num); payment.add(exp_d); payment.add(cvv);
										
										payment.add(b2);
										
										payment.setSize(500, 350);
										payment.setLayout(null);
										payment.setLocationRelativeTo(null);
										payment.setVisible(true);
										
								
									}
									
									
								}
								
							});
								
								
							
							//adding JLabels and TextField to the frame
							Vehicle_info.add(v_make); Vehicle_info.add(v_model); Vehicle_info.add(v_year); Vehicle_info.add(v_license_plate);
							Vehicle_info.add(v_color); Vehicle_info.add(v_axles);
							
							Vehicle_info.add(m); Vehicle_info.add(model); Vehicle_info.add(y); Vehicle_info.add(l_plate); Vehicle_info.add(c);
							Vehicle_info.add(a);
							
							Vehicle_info.add(n1);
							
							Vehicle_info.setSize(390, 400);
							Vehicle_info.setLayout(null);
							Vehicle_info.setLocationRelativeTo(null);
							Vehicle_info.setVisible(true);
							
							
							
						}
						
						
					}
					
				});
						
				
				//adding user name and password labels/text fields
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

}
