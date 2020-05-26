package comm.example.dao;

public class CustomerNotFoundException extends Exception {
	private String message;

	public CustomerNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
