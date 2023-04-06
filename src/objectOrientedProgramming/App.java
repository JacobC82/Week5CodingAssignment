package objectOrientedProgramming;

public class App {

	public static void main(String[] args) {
		Logger triStar = new AstriskLogger();
		triStar.simpleBuilder("Pepper!!");
		System.out.println("=======");
		triStar.errorBuilder("You ate my asterisk sandwich!!!");
	
		Logger space = new SpacedLogger();
		space.simpleBuilder("Pepper!!");
		System.out.println();
		space.errorBuilder("Pepper!!");
	}

}
