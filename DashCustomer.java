//FAST-TRAk Customer.java

/**Author: Bhumi Patel */

//Fields

class Client{
    private String userId;

    private String firstName;

    private String lastName;

    private String name;

    private String email;

    private Address a;

    private boolean activateAccount;

    private int pNum;

    public Client(){
        this.userId = " ";

        this.name = " ";

        this.email = " ";

        this.activateAccount = true;     

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
       this.name = getFname() + getLname();
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
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
        return "Client: " + this.getName() + "\n" + "Address: " + a.toString() + "\n" + "Account Activation: " + 
                this.getAccount();
    }




}

class Address{
    private int streetNumber;

    private String streetName;

    private int zipCode;

    private String city;

    public void setStreeNum(int streetNumber){
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
        return "\nName: " + this.getStreetName() + "\n" + "House-Number: " + this.getStreetNum() + "\n" + 
                "ZipCode: " + this.getZipCode() + "\n" + "City: " + this.getCity();
    }

}