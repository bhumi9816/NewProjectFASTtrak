package finalProject.codejava;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VehicleGUI implements ActionListener {
	
	JTextField m, model, y, l_plate, c, a;
	
	
	public VehicleGUI() {
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
		
		c = new JTextField();
		c.setBounds(140, 203, 140, 20);
		
		v_axles = new JLabel("No. of Axles: ");
		v_axles.setFont(new Font("Serif", Font.BOLD, 13));
		v_axles.setForeground(Color.GREEN);
		v_axles.setBounds(40, 207, 100, 100);
		
		a = new JTextField();
		a.setBounds(140, 243, 140, 20);
		
		
		JButton n1 = new JButton("Next");
		n1.setBounds(140, 295, 100, 20);
		n1.addActionListener(this);
			
			
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//checking if the vehicle fields are not empty
		
		if(m.getText().isEmpty() && model.getText().isEmpty() && y.getText().isEmpty() && 
				l_plate.getText().isEmpty() && c.getText().isEmpty() && a.getText().isEmpty()) {
			System.out.println("Enter valid input");
			
			//possibly could have a JOptionShowMessage() to display Error message
		}
		
		if(l_plate.getText().length() != 7) {
			
			System.out.println("Not Enough Characters");
			
			//error message could be displayed 
		}
		
		else {
			
			//creating Vehicle object and passing Vehicle info in the constructor
			
			Vehiclecopy v1 = new Vehiclecopy(m.getText(), model.getText(), Integer.parseInt(y.getText()),
					l_plate.getText(), c.getText(), Integer.parseInt(a.getText()));
			
			new PaymentGUI();
		
		
		}
		
	}
	
}
