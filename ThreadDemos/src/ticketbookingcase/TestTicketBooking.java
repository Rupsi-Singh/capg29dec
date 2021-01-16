package ticketbookingcase;

public class TestTicketBooking {

	public static void main(String[] args) {
		TicketBookingServiceImpl target = new TicketBookingServiceImpl();
		Thread thread1 = new Thread(target);
		Thread thread2= new Thread(target);
		thread1.setName("Pranjali");
		thread2.setName("Rishita");
		thread1.start();
		thread2.start();

	}

}
