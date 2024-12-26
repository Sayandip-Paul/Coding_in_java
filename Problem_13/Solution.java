import java.util.*;
class Player
{
	private int playerId;
	private String skill;
	private String level;
	private int points;
	
	public Player(int playerId,String skill,String level,int points)
	{
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}
	
	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}
	
	public void setSkill(String skill)
	{
		this.skill = skill;
	}
	
	public void setLevel(String level)
	{
		this.level = level;
	}
	
	public void setPoints(int points)
	{
		this.points = points;
	}
	
	// ------------------------------
	
	public int getPlayerId()
	{
		return playerId;
	}
	
	public String getSkill()
	{
		return skill;
	}
	
	public String getLevel()
	{
		return level;
	}
	
	public int getPoints()
	{
		return points;
	}
}

class Solution
{
	public static int findPointsForGivenSkill(Player obj[],String s)
	{
		int res = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getSkill().equalsIgnoreCase(s))
			{
				res = res + obj[i].getPoints();
			}
		}
		if(res > 0)
			return res;
		else
			return 0;
	}
	
	public static Player getPlayerBasedOnLevel(Player obj[],String s,String l)
	{
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getSkill().equalsIgnoreCase(s) && obj[i].getLevel().equalsIgnoreCase(l) && obj[i].getPoints() >= 20)
				return obj[i];
		}
		return null;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Player ply[] = new Player[n];
		for(int i = 0; i < n; i++)
		{
			int playerId = sc.nextInt();
			sc.nextLine();
			String skill = sc.nextLine();
			String level = sc.nextLine();
			int points = sc.nextInt();
			sc.nextLine();
			ply[i] = new Player(playerId,skill,level,points);
		}
		String sk = sc.nextLine();
		String lv = sc.nextLine();
		
		int r = findPointsForGivenSkill(ply,sk);
		Player p = getPlayerBasedOnLevel(ply,sk,lv);
		if(r > 0)
			System.out.println(r);
		else
			System.out.println("The given Skill is not available");
		
		if(p == null)
			System.out.println("No player is available with specified level, skill and eligibility points");
		else
			System.out.println(p.getPlayerId());
		
	}
}