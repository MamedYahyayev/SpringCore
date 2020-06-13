package az.maqa.project;

public class Welcome {

	private String welcomeMessage;
	private String name;

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void welcome() {
		System.out.println(welcomeMessage + " " + name) ;
	}

}
