
public class BoardGame extends Game

{
	protected int numberOfDice;
	
	public BoardGame()
	{
		int randomDice = (int)(Math.random()*6) + 1;
		numberOfDice = randomDice;
	}
	
public void winGame()
{
	super.winGame();
	System.out.println("Take that suckers!");
}

public void rollDice()
{
	System.out.println ("I rolled a " + numberOfDice + "!");
}

public void readRules()
{
	System.out.println("On the back of the box.");
}

public void countPlayers()
{
	System.out.println("There are 6 players playing.");
}

public void newGame()
{
	System.out.println("Now lets play " + super.gamesToPlay);
}

public void getGamesToPlay()
{
System.out.println(gamesToPlay);
gamesToPlay = "UNO!";
}



	}
