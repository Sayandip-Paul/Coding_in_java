import java.util.*;
class Footwear
{
	private int footwearId;
	private String footwearName;
	private String footwearType;
	private int price;
	
	public Footwear(int footwearId,String footwearName,String footwearType,int price)
	{
		this.footwearId = footwearId;
		this.footwearName = footwearName;
		this.footwearType = footwearType;
		this.price = price;
	}
	
	public int getFootwearId()
	{
		return footwearId;
	}
	
	public String getFootwearName()
	{
		return footwearName;
	}
	
	public String getFootwearType()
	{
		return footwearType;
	}
	
	public int getPrice()
	{
		return price;
	}
}

class Solution
{
	public static int getCountByType(Footwear obj[],String t)
	{
		int cnt = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getFootwearType().equalsIgnoreCase(t))
			{
				cnt++;
			}
		}
		if(cnt == 0)
			return 0;
		else
			return cnt;
	}
	
	public static int getSecondHighestPriceByBrand(Footwear obj[],String n)
	{
		List<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getFootwearName().equalsIgnoreCase(n))
			{
				r.add(obj[i].getPrice());
			}
		}
		if(r.size() != 0)
		{
			r.sort(Comparator.reverseOrder());
			return r.get(1);
		}
		else
			return 0;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Footwear ftw[] = new Footwear[5];
		for(int i = 0; i < ftw.length; i++)
		{
			int footwearId = sc.nextInt();
			sc.nextLine();
			String footwearName = sc.nextLine();
			String footwearType = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			ftw[i] = new Footwear(footwearId,footwearName,footwearType,price);
		}
		String fType = sc.nextLine();
		String name = sc.nextLine();
		
		int r = getCountByType(ftw,fType);
		int p = getSecondHighestPriceByBrand(ftw,name);
		
		getSecondHighestPriceByBrand(ftw,name);
		if(r > 0)
			System.out.println(r);
		else
			System.out.println("Footwear not available");
		
		if(p != 0)
		{
			for(int i = 0; i < ftw.length; i++)
			{
				if(ftw[i].getPrice() == p)
				{
					System.out.println(ftw[i].getFootwearId());
					System.out.println(ftw[i].getFootwearName());
					System.out.println(ftw[i].getPrice());
				}
			}
		}
		else
			System.out.println("Brand not available");
	}
}
  