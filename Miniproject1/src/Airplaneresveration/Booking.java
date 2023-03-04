package Airplaneresveration;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passangerName;
	int planeNo;
	Date date;
	private ArrayList<plane> planeno;
	@SuppressWarnings("resource")
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passangerName = scanner.next();
		System.out.println("Enter planeNo: ");
		planeNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<plane> planes){
		@SuppressWarnings("unused")
		int capacity = 0;
		for(plane plane:planes) {
			
				capacity = plane.getCapacity();
			
		}
		@SuppressWarnings("unused")
		int booked = 0;
		for(Booking p:bookings) {
			if(p.planeno == planes && p.date.equals(date)) {
				booked++;
			}
				
		}
		return false;
		
	}

}
