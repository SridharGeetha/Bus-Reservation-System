package BusReservation;

public class Bus {
    private int busId;
    private boolean ac;
    private int capacity;
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
}
