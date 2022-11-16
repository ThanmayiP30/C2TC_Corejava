package classandobject;

public class Cricket {
	String name="Viratkohli";
	int age =34;
	String role="Batsman";
	String Nationality="Indian";
	void display() {
		System.out.println("I Love Cricket");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Cricket c=new Cricket();
		c.display();
		System.out.println("main method ended");

	}

}
