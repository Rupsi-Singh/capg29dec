package ticketbookingcase;

public class TicketBookingServiceImpl implements Runnable{
	
	private int availableTicket=1;
	
	private synchronized void bookTicket(String name) {
		System.out.println("Availability check by : "+name+" : available : "+availableTicket);
		if(availableTicket>=1) {
			System.out.println("Booking started for  : "+name);
			availableTicket=availableTicket-1;
			System.out.println("Booking Completed for  : "+name);
		}
		else {
			System.out.println("No Ticket available for : "+name);
		}
		
	}

	@Override
	public void run() {
		String name =  Thread.currentThread().getName();
		bookTicket(name);
		
	}

}
