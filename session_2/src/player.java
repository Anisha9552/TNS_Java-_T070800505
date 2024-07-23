
public class player {
	private String playerName, playerCountry;
	
	public player()
	{
		this("Sachin");
		System.out.println("Default");
		playerCountry = "India";
		
	}
	public player(String playerName)
	{
		//this
		System.out.println("Parameterized");
		this.playerName = playerName;
		
	}
	@Override
	public String toString() {
		return "player [playerName=" + playerName + ", playerCountry=" + playerCountry + "]";
	}
	public static void main(String[]args)
	{
		player p = new player();
		System.out.println(p);
		
	}
	
	
	

}
