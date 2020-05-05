import java.awt.event.*; 
import javax.swing.*;  
import java.awt.event.ActionListener;

public class GUIHub extends JFrame implements ActionListener
{
	
	public static void main(String[] args)
	{ 
		JFrame frame=new JFrame("HUB ");  //creating an instance of JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Vehicle vehicle1= new Vehicle(); 
		
		 //View Vehicle Info
		   JButton button1=new JButton("View Vehicles "); 
		   button1.setBounds(20,20,150,30);
		   frame.add(button1);
		   button1.addActionListener
		   (
				   new ActionListener() {
					   public void actionPerformed(ActionEvent e)
					   {
						   JOptionPane.showMessageDialog(null,vehicle1.getVehicleInfo());
					   }
				   }	   
				   
		   );
		   
		   
		   //View Balance
		   JButton button2=new JButton("View Balance ");
		   frame.add(button2);
		   button2.setBounds(180,20,150,30);
		   
		   JButton button3=new JButton("View Personal Info ");
		   frame.add(button3);
		   button3.setBounds(340,20,150,30); 
		   
		   //Add/Edit Vehicle Infp
		   JButton button4= new JButton("Add/Edit Vehicle Info");
		   frame.add(button4);
		   button4.setBounds(500,20,200,30);  
		   button4.addActionListener
		   (
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						//License Plate Number
						String licensePlate= JOptionPane.showInputDialog("Enter the License Plate NUmber of your car (it should be 7 Apha-Numeric): ");
						vehicle1.setLicense_Plate(licensePlate);
						
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
							JOptionPane.showMessageDialog(null,"Invalid number of pair of axles. Please enter a number more than 2. ");
							num=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pair of axles of your car, to know the size of your car (atleast two pairs): "));
						}
						
						boolean clean= Boolean.parseBoolean(JOptionPane.showInputDialog("Is your Vehicle clean?(true/false): "));
						
						
						vehicle1.setVehicleInfo("19445",compname,model,year,color,licensePlate, clean, 1, num);
						
						
					}
				}
				   
		   );
		   
		   JButton button5=new JButton("Delete Vehicle ");
		   frame.add(button5);
		   button5.setBounds(150,60,150,30); 
		   
		   vehicle1.deleteVehicle("19445");
	
		   
		   JButton button6=new JButton("Sign Out");
		   frame.add(button6);
		   button6.setBounds(350,60,150,30);

		   
		   frame.setSize(800,200);  
		   frame.setLayout(null);  
		   frame.setVisible(true);  
		       
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	


