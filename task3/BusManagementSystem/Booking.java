package com.cognifyz.task3.BusManagementSystem;
import java.util.*;
import java.text.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(Scanner scanner) {
        System.out.println("Enter name of Passenger: ");
        passengerName = scanner.next();
        System.out.println("Enter BusNO: ");
        busNo = scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy : ");
        String dateInput = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please try again.");
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return "Passenger: " + passengerName +
               ", Bus No: " + busNo +
               ", Date: " + dateFormat.format(date);
    }
}
