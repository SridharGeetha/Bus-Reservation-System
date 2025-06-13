import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
 interface ListInformation {

 public void listInformation();

}
class Customer implements ListInformation{

    private int customerId;
    private String customerName;
    private String email;
    private String password;

    public Customer(int customerId,String customerName ,String email,String password){
        this.customerName = customerName;
        this.customerId = customerId;
        this.email = email;
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean Login(ArrayList<Customer> customer , String email ,String password){
        for(Customer c : customer){
            if(c.getEmail().equals(email) && c.getPassword().equals(password)){
                System.out.println("Login Successful");
                System.out.println("Welcome "+c.getCustomerName());
                return true;
            }
        }
        System.err.println("Invalid Email or Password");
        return false;
    }

    @Override
    public void listInformation() {
        System.out.println("Customer Name : "+customerName+" Email : "+email);
    }
    
}
class Bus implements ListInformation{
    private int busId;
    private String busName; 
    private boolean ac;
    private int capacity;

    public Bus(int busId, String busName, boolean ac, int capacity) {
        this.busId = busId;
        this.busName = busName;
        this.ac = ac;
        this.capacity = capacity;
    }
    public String getBusName() {
        return busName;
    }
    public void setBusName(String busName) {
        this.busName = busName;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public int getBusId(){
        return busId;
    }
    public void setBusId(int busId){
        this.busId = busId;
    }
    public boolean getAc(){
        return ac;
    }
    public void setAC(boolean ac){
        this.ac = ac;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    @Override
    public void listInformation() {
        System.out.println("Bus Name : "+busName+" Capacity : "+capacity);
    }
}
class Booking implements ListInformation{
    private String userName;
    private int busNo;
    private Date date; 

    
    public Booking(String userName, int busNo, Date date) {
        this.userName = userName;
        this.busNo = busNo;
        this.date = date;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getUserName() {
        return userName;
    }
    public int getBusNo() {
        return busNo;
    }
    public Date getDate() {
        return date;
    }
    @Override
    public void listInformation() {

    }
}
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       ArrayList<Customer> customers = new ArrayList<>();
       customers.add(new Customer(1,"Sridhar","sridhar123@gmail.com","sri123@@"));
       customers.add(new Customer(2,"sam","sam123@gmail.com","sam123@@"));
       while (true) {
        System.out.println("1.Login");
        System.out.println("2.Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter email : ");
                sc.nextLine();
                String email = sc.nextLine().trim();
                System.out.println("Enter password : ");
                String password = sc.nextLine();
                boolean isLogin = Customer.Login(customers, email, password);
                while(isLogin) {
                    
                }
                break;
        
            default:
                System.out.println("hello");
                break;
        }
       }
    }
}
