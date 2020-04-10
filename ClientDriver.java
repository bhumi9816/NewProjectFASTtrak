
public class ClientDriver{
    public static void main(String[] args){
        System.out.println("Welcome to FastTrak");

        Address a = new Address();
        a.setStreetName("Hayward Highlands");
        a.setStreetNum(23450);

        
        DashCustomer c = new DashCustomer("jdoe656", "John", "Doe", "jdoe956@hotmail.com", true);
        System.out.println(c.toString());
        System.out.println(a.toString());
        
        
    }
       
}

