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
						JFrame n_1 = new JFrame("Create Account");
						n_1.getContentPane().setBackground(Color.BLACK);
						
						//setting up client username
						JLabel u = new JLabel("Username: ");
						u.setFont(new Font("Serif", Font.BOLD, 13));
						u.setForeground(Color.GREEN);
						u.setBounds(110, 20, 102, 20);
						
						JTextField user = new JTextField();
						user.setBounds(100, 55, 102, 20);
						
						
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
						
						
						
						JButton next1 = new JButton("Next");
						next1.setBounds(100, 170, 102, 20);
						next1.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								if(user.getText().isEmpty() && pass.getText().isEmpty()) {
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
				System.out.println("Invalid Info");
				String u_name = ans.getText();
				
				String p_name = ans1.getText();
				
				DashCustomer c = new DashCustomer();
				
				if(c.checkUserId(u_name) == true && c.checkPassword(p_name)) {
					JFrame n_window = new JFrame("Home Page");
					n_window.getContentPane().setBackground(Color.BLACK);
					
					JLabel c1 = new JLabel("Welcome Bhumi");
					c1.setFont(new Font("Serif", Font.ITALIC, 15));
					c1.setForeground(Color.GREEN);
					c1.setBounds(50, 8, 130, 100);
					
					/*
					 * Text Area about Client Info, Button to Vehicle Info, Payment Button*/
					
					JButton b1 = new JButton("Vehicle Info");
					JButton b2 = new JButton("Payment Info");
					
					
					n_window.add(c1); n_window.add(b1); n_window.add(b2);
					
					
					
					n_window.setSize(400, 200);
					n_window.setLayout(null);
					n_window.setLocationRelativeTo(null);
					n_window.setVisible(true);
					
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


