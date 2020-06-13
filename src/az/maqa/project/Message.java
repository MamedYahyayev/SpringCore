package az.maqa.project;

public class Message {
	private String message;

	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void welcomeMessage(String name) {
		System.out.println(message + name);
	}
	
	

}
