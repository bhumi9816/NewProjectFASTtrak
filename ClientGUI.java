package finalProject.codejava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ClientGUI implements ActionListener {
	
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
		
		b1 = new JButton("Login");
		b1.setBounds(100, 132, 93, 30);
		b1.addActionListener(this);
		
		
		
		b2 = new JButton("Create Account");
		b2.setBounds(250, 132, 150, 30);
		
		
		
		f.add(l);
		f.add(b1);
		f.add(b2);
		
		
		f.setSize(550, 210);
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
		//ans.addActionListener(this);
		
		JLabel password = new JLabel("Password ");
		password.setFont(new Font("Serif", Font.BOLD, 18));
		password.setForeground(Color.GREEN);
		password.setBounds(110, 97, 100, 100);
		
		ans1 = new JTextField();
		ans1.setBounds(100, 165, 95, 20);
		
		JButton click = new JButton("login");
		click.setBounds(105, 210, 85, 20);
		click.addActionListener(this);
		
		
		f1.add(user_name); f1.add(password); f1.add(ans); f1.add(ans1);
		
		f1.add(click);
	
		f1.setSize(300, 300);
		f1.setLayout(null);
		
		f1.setLocationRelativeTo(null);
		f1.setVisible(true);
			
		
	}
	
	
	
	public void actionPerformed1(ActionEvent e) {
		String u_name = ans.getText();
		
		String p_name = ans1.getText();
		
		DashCustomer c = new DashCustomer();
		
		if(c.checkUserId(u_name) == true) {
			JFrame n_window = new JFrame("Home Page");
			
			
			n_window.setSize(300, 300);
			n_window.setLayout(null);
			
			n_window.setLocationRelativeTo(null);
			
			n_window.setVisible(true);
			
		}
		
	}
	
	

	
	
	
	

}
