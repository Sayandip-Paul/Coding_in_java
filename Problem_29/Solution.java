import java.util.*;
class Engine
{
	private int engineId;
	private String engineName;
	private String engineType;
	private double enginePrice;
	
	public Engine(int engineId,String engineName,String engineType,double enginePrice)
	{
		this.engineId = engineId;
		this.engineName = engineName;
		this.engineType = engineType;
		this.enginePrice = enginePrice;
	}
	
	public int getEngineId()
	{
		return engineId;
	}
	
	public String getEngineName()
	{
		return engineName;
	}
	
	public String getEngineType()
	{
		return engineType;
	}
	
	public double getEnginePrice()
	{
		return enginePrice;
	}
}

public class Solution
{
	public static int findAvgEnginePriceByType(Engine obj[],String type)
	{
		double res = 0;
		int cnt = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getEngineType().equalsIgnoreCase(type))
			{
				res = res + obj[i].getEnginePrice();
				cnt++;
			}
		}
		if(cnt != 0)
			return (int)res/cnt;
		else
			return 0;
	}
	
	public static List<Integer> searchEngineByName(Engine obj[],String name)
	{
		List<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getEngineName().equalsIgnoreCase(name))
			{
				r.add(obj[i].getEngineId());
			}
		}
		if(r.size() != 0)
		{
			r.sort(null);
			return r;
		}
		else
			return null;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Engine eng[] = new Engine[4];
		List<Integer> g = new ArrayList<Integer>();
		for(int i = 0; i < eng.length; i++)
		{
			int engineId = sc.nextInt();
			sc.nextLine();
			String engineName = sc.nextLine();
			String engineType = sc.nextLine();
			double enginePrice = sc.nextDouble();
			sc.nextLine();
			eng[i] = new Engine(engineId,engineName,engineType,enginePrice);
		}
		String eType = sc.nextLine();
		String eName = sc.nextLine();
		
		int p = findAvgEnginePriceByType(eng,eType);
		
		if(p == 0)
			System.out.println("There are no engine with given type");
		else
			System.out.println(p);
		
		g = searchEngineByName(eng,eName);
		
		if(g != null)
		{
			for(int each: g)
				System.out.println(each);
		}
		else
			System.out.println("There are no engine with the given name");
	}
}