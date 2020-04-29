import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentGUI {
	public static void main(String [] args) {
		
		JFrame frame = new JFrame("Your Balance"); //Create an instance of JFrame
		Payment payment1 = new Payment();
		
		//View credit card info
		JButton buttonViewInfo = new JButton("View Credit Card Info"); //Create instance of JButton for View info
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
						
//						JOptionPane.showMessageDialog(null, payment1.getCardInfo());
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
		
		
		frame.setSize(700,800); //Width, Height of window
		frame.setLayout(new FlowLayout()); //No layout managers
		frame.setVisible(true); //Make frame visible
		
	}
}
