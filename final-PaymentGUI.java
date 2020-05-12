<<<<<<< HEAD:PaymentGUI.java
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
		
		JButton b2 = new JButton("Finish");
		b2.setBounds(180, 210, 100, 20);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(c_name.getText().isEmpty() && c_num.getText().isEmpty() && exp_d.getText().isEmpty() &&
						cvv.getText().isEmpty()) {
					System.out.println("Enter Valid Input");
=======
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PaymentGUI extends JFrame implements ActionListener{
	public PaymentGUI(Payment paymentArg, String usernameArg) throws FileNotFoundException {
		
		JFrame frame = new JFrame("Your Balance"); //Create an instance of JFrame
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Payment payment1 = paymentArg;
		String username1 = usernameArg;
		
		String fileName = "paymentDatabase.txt";
		String fileHistory = "";
		File myFile = new File(fileName);
		Scanner myScanner = new Scanner(myFile);
		String name;
		String num;
		String exp;
		String ccv;
		while(myScanner.hasNextLine()) {
			String[] readingArray = myScanner.nextLine().split(",");
			if(username1.compareTo(readingArray[0])==0) { //if the username matches active username
				name = readingArray[1];
				num = readingArray[2];
				exp = readingArray[3];
				ccv = readingArray[4];
				payment1.setCardName(name);
				payment1.setCardNum(num);
				payment1.setExpDate(exp);
				payment1.setCCV(ccv);
			}
			else {
				fileHistory+= readingArray[0]+readingArray[1]+readingArray[2]+readingArray[3]+readingArray[4]+"\n";
			}
		}
		myScanner.close();
		
		//View credit card info
		JButton buttonViewInfo = new JButton("View Credit Card Info/Account Balance"); //Create instance of JButton for View info
		buttonViewInfo.setBounds(130, 100, 300, 30); //Set size of button x-axis, y-axis, width, height
		frame.add(buttonViewInfo); //Add button to JFrame
		buttonViewInfo.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							JOptionPane.showMessageDialog(null, payment1.getCardInfo());
						}
					}
		);
		
		
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
>>>>>>> master:final-PaymentGUI.java
				}
				
				if(c_num.getText().length() != 16 && cvv.getText().length() != 3) {
					System.out.println("Invalid Input");
				}
				
				else {
					
					//creating Payment object and passing all info to the constructor
					Payment payInfo = new Payment(c_name.getText(), c_num.getText(), exp_d.getText(), cvv.getText());
					
					//open the Hub and connect with all classes
					new Hub();
				}
				
			}
			
		});
		
<<<<<<< HEAD:PaymentGUI.java
	
		
		//adding labels and textField to frames
		payment.add(cardName); payment.add(cardNumber); payment.add(expire_date); payment.add(CVV);
		
		payment.add(c_name); payment.add(c_num); payment.add(exp_d); payment.add(cvv);
		
		payment.add(b2);
		
		payment.setSize(500, 350);
		payment.setLayout(null);
		payment.setLocationRelativeTo(null);
		payment.setVisible(true);
=======
		//Save Changes
		JButton buttonSave = new JButton("Save Changes"); //Create instance for Save
		buttonSave.setBounds(130, 100, 300, 30); //Set size
		frame.add(buttonSave); //Add button to JFrame	
		buttonSave.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						File fnew=new File(fileName);
						FileWriter fWriter;
						
						try {
							fWriter = new FileWriter(fnew, false);
							fWriter.write(username1+","+payment1.getCardName()+","+payment1.getCardNum()+","+payment1.getExpDate()+","+payment1.getCCV()+","+payment1.getAccountBalance()+"\n");
							fWriter.close();
						}catch(IOException e) {
							e.printStackTrace();
						}
						JOptionPane.showMessageDialog(null,"Changes Saved!");
					}
				}
		);
		
		frame.setSize(700,500); //Width, Height of window
		frame.setResizable(false);
		frame.setLayout(new FlowLayout()); //No layout managers
		frame.setVisible(true); //Make frame visible
>>>>>>> master:final-PaymentGUI.java
		
		
	}

}
