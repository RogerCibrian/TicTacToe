package game.files;

public class Player {
	
	private String playerName;
	private String playerCharacter;
	
	Player(String playerName, String playerCharacter) {
		this.setPlayerName(playerName);
		this.setPlayerCharacter(playerCharacter);
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public String getPlayerCharacter() {
		return playerCharacter;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public void setPlayerCharacter(String playerCharacter) {
		this.playerCharacter = playerCharacter;
	}
	
}
