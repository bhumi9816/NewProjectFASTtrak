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
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
