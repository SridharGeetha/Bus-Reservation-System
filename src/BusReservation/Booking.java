package BusReservation;

import java.util.Date;

public class Booking {
    private String userName;
    private int busNo;
    private Date date;
    
    public Booking(){
        
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
}
