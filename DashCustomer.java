package finalProject.codejava;

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

    public DashCustomer(){
        this.userId = " ";

        this.name = " ";

        this.email = " ";

        this.activateAccount = true;     

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

        //checking for valid-userId... use '&' operator
        if(id.matches("[a-zA-Z0-9]+") && id.length() >=6){
            return true;
        }

        else{
            return false;
        }

    }

    public boolean checkPassword(String password){
        if(password.matches("[a-zA-Z0-9]+@$") && password.length()>=8){
            return true;
        }

        else{
            return false;
        }
    }

}

/**Fields for Address Class */

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
