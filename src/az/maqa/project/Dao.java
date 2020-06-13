package az.maqa.project;

public class Dao {

	private Database database;

	protected void welcomeMessage() {	
		System.out.println("Welcome to Our Project");
	}

	private void byeByeMessage() {
		System.out.println("Bye-bye");
	}
	

	
	public void openConnection() {
		System.out.println(
				this.database.getUrl() + " " + this.database.getUsername() + " " + this.database.getPassword());
		//System.out.println("Open connnection");
	}

	public void closeConnection() {
		//System.out.println("Close conncetion");
	}

	public Dao() {

	}

	public Dao(Database database) {
		this.database = database;
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

}
