package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Revervation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room Number: ");
		int roomNumber = entrada.nextInt();
		System.out.print("Check-in date (dd/mm/yyyy) ");
		Date checkin = sdf.parse(entrada.next());

		System.out.print("Check-out date (dd/mm/yyyy) ");
		Date checkout = sdf.parse(entrada.next());

		// n�o � depois do checkin
		if (!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Revervation reservation = new Revervation(roomNumber, checkin, checkout);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(entrada.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(entrada.next());

			Date now = new Date();
			if (checkin.before(now) || checkout.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (!checkout.after(checkin)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkin, checkout);
				System.out.println("Reservation: " + reservation);
			}
		}
		System.out.println();
		entrada.close();
	}
}
