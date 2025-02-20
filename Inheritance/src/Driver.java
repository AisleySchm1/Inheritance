
public class Driver
	{

		public static void main(String[] args)
			{
				Game x = new BoardGame();
				
				x.countPlayers();
				x.readRules();
				((BoardGame)x).rollDice();
				((BoardGame)x).getGamesToPlay();
				x.winGame();
				x.newGame();
			
			}

	}
