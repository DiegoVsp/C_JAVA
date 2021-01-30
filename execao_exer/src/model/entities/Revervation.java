package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Revervation {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // colocando como est�tico para que n�o
																				// seja instanciado um novo
																				// simpledateformat para cada objeto
																				// reservation que minha aplica��o tiver
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	public Revervation() {
	}

	public Revervation(Integer roomNumber, Date checkin, Date checkout){
		if (!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duration() {
		long diferenca = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS); // converte valor diferenca para dias
	}

	public void updateDates(Date checkin, Date checkout) {
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = checkin;
		this.checkout = checkout;

	}

	@Override
	public String toString() { // toString � uma sobreposi��o
		return "Room " + roomNumber + ", checkin: " + sdf.format(checkin) + ", checkout " + sdf.format(checkout) + ", "
				+ duration() + " nights";
	}
}
