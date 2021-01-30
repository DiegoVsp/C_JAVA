package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Revervation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room Number: ");
			int roomNumber = entrada.nextInt();
			System.out.print("Check-in date (dd/mm/yyyy) ");
			Date checkin = sdf.parse(entrada.next());

			System.out.print("Check-out date (dd/mm/yyyy) ");
			Date checkout = sdf.parse(entrada.next());

			Revervation reservation = new Revervation(roomNumber, checkin, checkout);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(entrada.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(entrada.next());

			reservation.updateDates(checkin, checkout);
			System.out.println("Reservation: " + reservation);

		} catch (ParseException e) {
			System.out.println("Inv�lid date format");
		} catch (DomainException e) {
			System.out.println("Error in reservation: "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

		entrada.close();
	}
}
