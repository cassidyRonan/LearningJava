
public class Battleship {
	private String[] cellLocations;
	private int numOfHits = 0;
	
	public String checkIfHit(String cell) 
	{
		String result = "Miss";
	
		cell = cell.toUpperCase();
		
		for(String loc : cellLocations)
		{	
			if(loc.equals(cell))
			{
				result = "Hit";
				numOfHits++;
				
				if(numOfHits >= cellLocations.length)
				{ result = "Destroyed"; }
				
				break;
			}
		}
		
		return result;
	}
	
	public void setLocations(String[] locations)
	{
		cellLocations = locations;
	}
}
