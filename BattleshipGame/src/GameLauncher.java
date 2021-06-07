import java.util.Scanner;

public class GameLauncher {

	static boolean allShipsDestroyed = false;
	static Battleship[] battleships;
	static int destroyedShips = 0;
	
	public static void main(String[] args) {
		start();
	}
	
	private static void start() 
	{
		battleships = new Battleship[] {new Battleship(), new Battleship(), new Battleship()};
		
		battleships[0].setLocations(new String[] { "A3","A4","A5" });
		battleships[1].setLocations(new String[] { "C8","D8","E8" });
		battleships[2].setLocations(new String[] { "F2","F3","F4" });
		
		gameLoop();
	}
	
	private static void gameLoop()
	{
		Scanner sc = new Scanner(System.in);

		while(allShipsDestroyed == false)
		{
			System.out.println("\nSelect a cell (A0 - H8): ");
			String chosenCell = sc.nextLine();
			
			for(Battleship ship : battleships)
			{
				String result = ship.checkIfHit(chosenCell);
				
				if(result == "Hit")
				{
					System.out.println("You hit the ship!");
					break;
				}
				else if(result == "Destroyed")
				{
					destroyedShips++;					
					System.out.println("You destroyed the ship!");
					break;
				}
			}
			
			if(destroyedShips >= battleships.length) 
			{ allShipsDestroyed = true; }
		}
		
		sc.close();
		System.out.println("Congrats, you destroyed all the ships!");
	}

}
