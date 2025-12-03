package com.cognifyz.task3.BusManagementSystem;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    private String driver;
    private String from;
    private String to;
    private int rate;

    Bus(int no, boolean ac, int cap ,String drive,String from ,String to,int rate) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
        this.driver = drive;
        this.from=from;
        this.to=to;
        this.rate=rate;
    }

    public void setCapacity(int cap) {
        this.capacity = cap;
    }
    
    public void setdriver(String drive) {
    	this.driver=drive;
    }
    
    public void setrate(int rate) {
    	this.rate=rate;
    }
    public void setfrom(String from){
    	this.from=from;
    }
    public void setto(String to) {
    	this.to=to;
    }

    public void setAc(boolean val) {
        this.ac = val;
    }
    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }
    public String getdriver() {
    	return driver;
    }
    public String getfrom() {
    	return from;
    }
    public String getto() {
    	return to;
    }

    public int getrate() {
    	return rate;
    }
    public int getBusNo() {
        return busNo;
    }

    public void displayBusInfo() {
        System.out.println("Bus No: " + busNo + " | AC: " + ac + " | Capacity: " + capacity + "| Driver Name:"+driver+"| Start:"+from+"| End:"+to+"| Rate:"+rate);
    }

    @Override
    public String toString() {
        return "Bus No: " + busNo + ", AC: " + ac + ", Capacity: " + capacity  + ", Driver Name: "+ driver +", Start:"+ from +", End:"+ to + ", Rate:"+rate;
    }
}
