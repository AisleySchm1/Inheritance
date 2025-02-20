
public abstract class Game

	{
	
protected String gamesToPlay = "YAHTZEE!";
	
	public Game()
	{
		super();
	}
	

public abstract  void readRules();
	
public void winGame()
{
	
	System.out.println("I win!");	
}

public void countPlayers()
{
	System.out.println("There are 4 players playing.");
}

public void newGame()
{
	gamesToPlay = "SCAT";
}

	}
