package game.files;

public class Player {
	
	private String playerName;
	
	Player(String playerName) {
		this.setPlayerName(playerName);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
