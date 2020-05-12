package finalProject.codejava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PaymentGUI {
	
	public PaymentGUI() {
		JFrame payment = new JFrame("Payment Info");
		payment.getContentPane().setBackground(Color.BLACK);
		
		JLabel cardName, cardNumber, expire_date, CVV;
		
		JTextField c_name, c_num, exp_d, cvv;
		
		cardName = new JLabel("Name (that appears on card): ");
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
		
		JButton b2 = new JButton("Next");
		b2.setBounds(180, 210, 100, 20);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(c_name.getText().isEmpty() && c_num.getText().isEmpty() && exp_d.getText().isEmpty() &&
						cvv.getText().isEmpty()) {
					System.out.println("Enter Valid Input");
				}
				
				if(c_num.getText().length() != 16 && cvv.getText().length() != 3) {
					System.out.println("Invalid Input");
				}
				
				else {
					
					//creating Payment object and passing all info to the constructor
					Payment payInfo = new Payment(c_name.getText(), Long.parseLong(c_num.getText()), 
							Integer.parseInt(exp_d.getText()), Integer.parseInt(cvv.getText()));
					
					//open the Hub
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
