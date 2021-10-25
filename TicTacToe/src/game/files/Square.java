package game.files;

public class Square {
	
	private String displayCharacter;
	
	Square (String displayCharacter) {
		this.setDisplayCharacter(displayCharacter);
	}

	public String getDisplayCharacter() {
		return displayCharacter;
	}

	public void setDisplayCharacter(String displayCharacter) {
		this.displayCharacter = displayCharacter;
	}
	
	
}
