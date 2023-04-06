package objectOrientedProgramming;

public class AstriskLogger implements Logger {
	
	public AstriskLogger() {
		System.out.println(getClass().getSimpleName());
	}
	
	@Override
	public void simpleBuilder(String word) {
		String msg = threeStarBuilder(word);
		System.out.println(msg);
	}

	private String threeStarBuilder(String word) {
		return "*** " + word + " ***";
	}

	@Override
	public void errorBuilder(String word) {
		String msg = threeStarBuilder("Error: " + word);
		String border = "*".repeat(msg.length());
		
		System.out.println(border);
		System.out.println(msg);
		System.out.println(border);
	}

}
