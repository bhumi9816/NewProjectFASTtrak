package finalProject.codejava;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/*
 * Client Fields */

public class DashCustomer {
	
	private String userId;

    private String firstName;

    private String lastName;

    private String name;

    private String email;

    private String password;

    private Address a;

    private boolean activateAccount;

    private int pNum;
    
    private Dictionary<String, String> cLoginInfo = new Hashtable<String, String>();
    
    private Dictionary<String, Vector<String>> cInfo = new Hashtable<String, Vector<String>>();
    
 

    public DashCustomer(){
        this.userId = " ";

        this.name = " ";

        this.email = " ";

        this.activateAccount = true;     

    }
    
    public DashCustomer(String userId) {
    	this.userId = userId;
    }

    public DashCustomer(String userId, String firstName, String lastName, String email, boolean activateAccount){
        this.userId = userId;

        this.firstName = firstName;

        this.lastName = lastName;
        
        this. email = email;

        this.activateAccount = activateAccount;

        
    }

    public void setId(String userId){
        this.userId = userId;
    }

    public String getId(){
        return this.userId;         
    }

    public void setFname(String firstName){
    	this.firstName = firstName;
    }

    public String getFname(){
        return this.firstName;
    }

    public void setLname(String lastName){
    	
        this.lastName = lastName;
    }

    public String getLname(){
        return this.lastName;
    }

    public String getName(){
       this.name = getFname() + " " + getLname();
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setAccount(boolean activateAccount){
        this.activateAccount = activateAccount;
    }

    public boolean getAccount(){
        return this.activateAccount;
    }

    public void setPhoneNum(int pNum){
        this.pNum = pNum;
    }

    public int getPhoneNum(){
        return this.pNum;
    }
    

    public String toString(){
        return "UserId: " + this.getId() + '\n' + "Client: " + this.getName() + '\n' + "Email: " + this.getEmail() +
               '\n'+ "Status: " + this.getAccount();
    }


    public boolean checkUserId(String id){

        //checking for valid-userId for character and length 
        if(id.matches("[a-zA-Z0-9]+") && id.length() >=6){
            return true;
        }

        else{
            return false;
        }

    }

    public boolean checkPassword(String password){
    	
    	//checking for valid-password for character and length
        if(password.matches("[a-zA-Z0-9]+@$!*") && password.length() >=8){
            return true;
        }

        else{
            return false;
        }
    }
    
    /*
     * Below function checks for the given id in the dictionary data set
     * The function also make sure that id and password follow character and length guideline*/
    
    public boolean checkData(String id, String password) {
    	
    	//loading data
    	loadData(id, password);
    	
    	Enumeration<String> e = cLoginInfo.keys();
    	
    		while(e.hasMoreElements()) {
    				if(e.nextElement().equals(id)) {
        				
        				return true;
        				
        			}     			
    			    			
        	}
    		
    		return false;
    }
 
    
    /*
     * Loading data to dictionary*/
    
    public void loadData(String id, String pass) {
    	
    	/*
    	 * Ten Stimulated user-Id and their password info to make sure correct client is logged in,
    	 * this can be further adapted to a user-id : password database*/
    	
    	//loading data to compare user_id and password
    	cLoginInfo.put("bhumi34", "Password21@");
    	cLoginInfo.put("john45", "jPassword10$");
    	cLoginInfo.put("kaite89", "kPasscode90!");
    	cLoginInfo.put("joshua2", "Passjosh56@");
    	cLoginInfo.put("kara23", "Kpassgen90$");
    	cLoginInfo.put("mary16", "Dyellow78@");
    	cLoginInfo.put("justin08", "Fellow56hi@");
    	cLoginInfo.put("care89l", "Caroline49@");
    	cLoginInfo.put("wyatt52", "Passwyatt76!");
    	cLoginInfo.put("hello90", "Byeehi71!");
    	
    	//loading new client info to the current dictionary
    	cLoginInfo.put(id, pass);
    	
    	
    	/*
    	 * Three stimulated user-Ids and their client information that can be further be adapted to
    	 * a database carrying client info. */
    	
    	//loading data for given user_id with their name, email and status
    	Vector<String> v1 = new Vector<String>();
    	v1.addElement("\nBhumi\t"); v1.addElement("Patel\n"); v1.addElement("bpatel23@horizon.csueastbay.edu\n");
    	v1.addElement(Integer.toString(93256) + '\n'); v1.addElement("Hayward");
    
    	//adding to the dictionary database for the given userId
    	cInfo.put("bhumi34",v1);
    	
    	Vector<String> v2 = new Vector<String>();
    	v2.addElement("\nJohn\t"); v2.addElement("Stewart\n"); v2.addElement("jcoolStewart99@gmail.com\n");
    	v2.addElement(Integer.toString(94589)+ '\n'); v2.addElement("San Fransico");
    	
    	cInfo.put("john45", v2);
    	
    	Vector<String> v3 = new Vector<String>();
    	v3.addElement("\nKaite\t"); v3.addElement("Morgan\n"); v3.addElement("kaitehii06@yahoo.com\n");
    	v3.addElement(Integer.toString(92110)+ '\n'); v3.addElement("Oakland");
    	
    	cInfo.put("kaite89", v3);
    	
    	
    }
    
    public String ViewInfo(String id) {
    	Vector<String> v = new Vector<String>();
    	
    	for(Enumeration enu = cInfo.keys() ; enu.hasMoreElements();) {
    		if(enu.nextElement().equals(id)) {
    			
    			v = cInfo.get(id);
    		}
    		
    	}
    	//System.out.println("Elements are " + v);
    	
    	return "User-Id: " + id + '\n' + v.get(0) + '\t' + v.get(1) + '\n' + v.get(2) + '\n' + v.get(3) + '\n' +
    			v.get(4);
    			  	
    }
    
 
    
    

	
	

}

/*
 * Fields for Address Class */

class Address{
    private int streetNumber;

    private String streetName;

    private int zipCode;

    private String city;

    public void setStreetNum(int streetNumber){
        this.streetNumber = streetNumber; 
    }

    public int getStreetNum(){
        return this.streetNumber;

    }

    public void setStreetName(String streetName){
        this.streetName = streetName;

    }

    public String getStreetName(){
        return this.streetName;

    }

    public void setZipCode(int zipCode){
        this.zipCode = zipCode;

    }

    public int getZipCode(){
        return this.zipCode;

    }

    public void setCity(String city){
        this.city = city;

    }

    public String getCity(){
        return this.city;

    }

    public String toString(){
        return "\nStreetName: " + this.getStreetName() + "\n" + "House-Number: " + this.getStreetNum() + "\n" + 
                "ZipCode: " + this.getZipCode() + "\n" + "City: " + this.getCity();
    }

}
