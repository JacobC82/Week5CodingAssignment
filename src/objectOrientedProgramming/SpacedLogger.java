package objectOrientedProgramming;

public class SpacedLogger implements Logger{
	
	public SpacedLogger() {
		System.out.println(getClass().getSimpleName()); 
	}
	
	
	
	
	@Override
	public void simpleBuilder(String word) {
		String spaceWord = buildSpacedLogger(word);
		System.out.println(spaceWord);
	}

	private String buildSpacedLogger(String word) {
		String built = "";
		
		for (int i = 0; i < word.length(); i++) {
			built += word.charAt(i)+ " ";
		}
		return built.substring(0, built.length() - 1);
	}
	@Override
	public void errorBuilder(String word) {
		String errorWithSpaces = "Error: " + buildSpacedLogger(word);
		System.out.println(errorWithSpaces);
	}

}
