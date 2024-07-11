package Esercizio_6;

public interface HotelBooking {
	
	void bookRoom(String passengerName);

	void changeName(String oldName, String newName);

	void cancelRoom(String passengerName);
	
	void avaibleRoom();
	
	void viewBook();
}
