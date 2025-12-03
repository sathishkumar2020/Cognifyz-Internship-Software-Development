package com.cognifyz.task3.BusManagementSystem; 
import java.util.Scanner; 
import java.util.ArrayList; 
public class BusDemo { 
	public static void main(String[] args) 
	{ 
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>(); 
		buses.add(new Bus(1, true, 30 ,"Sakthivel" ,"Madurai" ,"Chennai",900)); 
		buses.add(new Bus(2, false, 50 ,"Murugan" ,"Madurai" ,"Chennai" ,400)); 
		buses.add(new Bus(3, true, 48 ,"Kanthan" ,"Madurai" ,"Coimbatore" ,1000)); 
		buses.add(new Bus(4, false, 30 ,"Kadamban" ,"Madurai" ,"Coimbatore" ,350)); 
		buses.add(new Bus(5,true , 40 ,"Ganesh", "Madurai","Trichy" ,850)); 
		buses.add(new Bus(6,false, 45,"Sekar" ,"Madurai" , "Bengalore" ,900)); 
		buses.add(new Bus(7,true ,40,"Rishi" ,"Madurai" ,"Bengalore",1400)); 
		buses.add(new Bus(8,false,40,"SekarRao","Bangalore","Madurai",900)); 
		buses.add(new Bus(9,true ,45,"Dinesh","Bangalore","Madurai",1400)); 
		buses.add(new Bus(10,false,50 ,"sathish", "Coimbatore" ,"Chennai",600)); 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Available Buses:"); 
		for (Bus b : buses) 
		{ b.displayBusInfo();
		}
int userOpt = 1;
while (userOpt != 4) {
    System.out.println("\nEnter 1 to Book \t 2 to Cancel \t 3 to View Bookings \t 4 to Exit");
    try {
        userOpt = scanner.nextInt();
    } catch (Exception e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
        continue;
    }

    if (userOpt == 1) {
        Booking booking = new Booking(scanner);
        if (booking.isAvailable(bookings, buses)) {
            bookings.add(booking);
            System.out.println(" Your booking is confirmed.");
        } else {
            System.out.println("Sorry, bus is full. Try another bus or date.");
        }
    } else if (userOpt == 2) {
        System.out.println("Enter Bus No to cancel: ");
        int cancelBusNo = scanner.nextInt();
        System.out.println("Enter Passenger Name: ");
        String cancelName = scanner.next();

        bookings.removeIf(b -> b.busNo == cancelBusNo && b.passengerName.equals(cancelName));
        System.out.println("Booking cancelled if it existed.");
    } else if (userOpt == 3) {
        System.out.println("\n Current Bookings:");
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            for (Booking b : bookings) {
                System.out.println(b);
            }
        }
    }
    }
}
	}
