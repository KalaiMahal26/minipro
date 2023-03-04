package Airplaneresveration;
import java.util.Scanner;
import java.util.ArrayList;
public class reservation {

	public static void main(String[] args) {
		System.out.println(".....Welcome.....");
		System.out.println("Kindly See the details give below");
		System.out.println("     ");
		ArrayList<plane> planes = new ArrayList<plane>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		planes.add(new plane(15, 1, 10));
		planes.add(new plane(16, 2, 20));
		planes.add(new plane(17, 3, 30));
		
		int userOpt = 1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(plane p:planes) {
			p.displayplaneInfo();
		}
		while(userOpt==1) {
			System.out.println("   ");
			System.out.println(".....Enter your details.....");
		System.out.println("Enter 1 to Book and 2 to exit");
		userOpt = scanner.nextInt();
		if(userOpt == 1) {
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,planes)) {
				bookings.add(booking);
				System.out.println("Your booking is confirmed");
			}
			else
				System.out.println("Sorry. Try in another date");
			System.out.println("......Thank You......");
				
			
		}
		
		}

	}

	}
