package ödevDört;

public class Game {
	
	private String GameName;
	private double GameCost;
	
	public Game() {

	}
	
	public Game(String gameName, double gameCost) {
		this.GameName = gameName;
		this.GameCost = gameCost;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public double getGameCost() {
		return GameCost - (GameCost * 20 / 100);
	}
