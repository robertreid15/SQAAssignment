/**
 * This class defines a user and what variables need to 
 * be defined for a user. 
 * 
 */

public class User {

	private String email;
	private String number;
	
	public User() {
		
	}
	
	/*
	 * Constructor with details for a user.
	 */
	public User(String email, String number) {
		this.email = email;
		this.number = number;
	}

	//Getter Method for email
	public String getEmail() {
		return email;
	}

	//Setter Method for email
	public void setEmail(String email) {
		this.email = email;
	}

	//Getter Method for number
	public String getNumber() {
		return number;
	}

	//Setter Method for number
	public void setNumber(String number) {
		this.number = number;
	}

	//toString method for a User that displays all their details
	public String toString() {
		return "User [email=" + email + ", Number=" + number + "]";
	}
	
	
	
}