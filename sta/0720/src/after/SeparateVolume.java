package after;

public class SeparateVolume implements Lendable {

	String requestNO;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state!=0) {
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*"+bookTitle+"¿Ã ¥Î√‚µ ");
		System.out.println("¥Î√‚¿Œ: "+borrower);
		System.out.println("¥Î√‚¿œ: "+borrower+"\n");
		
		
	}


	@Override
	public void checkIn() {
		
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*"+bookTitle+"¿Ã π›≥≥µ ");
		
		
	}

}
