import java.util.*;
class Player
{
	private int playerId;
	private String playerName; 
	private int runs; 
	private String playerType;
	private String matchType;
	
	public Player(int playerId,String playerName,int runs,String playerType,String matchType)
	{
		this.playerId = playerId;
		this.playerName = playerName;
		this.runs = runs;
		this.playerType = playerType;
		this.playerType = playerType;
		this.matchType = matchType;
	}
	
	public int getPlayerId()
	{
		return playerId;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public int getRuns()
	{
		return runs;
	}
	
	public String getPlayerType()
	{
		return playerType;
	}
	
	public String getMatchType()
	{
		return matchType;
	}
}
public class Solution 
{
	public static int findPlayerWithLowestRuns(Player obj[],String t)
	{
		List<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getPlayerType().equalsIgnoreCase(t))
			{
				r.add(obj[i].getRuns());
			}
		}
		r.sort(null);
		if(r.size() == 0)
			return 0;
		else
			return r.get(0);
	}
	
	public static List<Integer> findPlayerByMatchType(Player obj[],String m)
	{
		List<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getMatchType().equalsIgnoreCase(m))
			{
				r.add(obj[i].getPlayerId());
			}
		}
		r.sort(Comparator.reverseOrder());
		if(r.size() == 0)
			return null;
		else
			return r;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> r = new ArrayList<Integer>();
		Player pl[] = new Player[4];
		for(int i = 0; i < pl.length; i++)
		{
			int playerId = sc.nextInt();
			sc.nextLine();
			String playerName = sc.nextLine(); 
			int runs = sc.nextInt();
			sc.nextLine();
			String playerType = sc.nextLine();
			String matchType = sc.nextLine();
			pl[i] = new Player(playerId,playerName,runs,playerType,matchType);
		}
		String pType = sc.nextLine();
		String mType = sc.nextLine();
		
		int run = findPlayerWithLowestRuns(pl,pType);
		r = findPlayerByMatchType(pl,mType);
		if(run > 0)
			System.out.println(run);
		else
			System.out.println("No such player");
		
		if(r != null)
		{
			for(int each: r)
				System.out.println(each);
		}
		else
			System.out.println("No Player with given matchType");
	}
}