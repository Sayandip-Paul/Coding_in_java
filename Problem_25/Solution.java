import java.util.*;
class Flowers
{
	private int flowerId;
	private String flowerName;
	private int price;
	private int rating;
	private String type;
	
	public Flowers(int flowerId,String flowerName,int price,int rating,String type)
	{
		this.flowerId = flowerId;
		this.flowerName = flowerName;
		this.price = price;
		this.rating = rating;
		this.type = type;
	}
	
	public int getFlowerId()
	{
		return flowerId;
	}
	
	public String getFlowerName()
	{
		return flowerName;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public String getType()
	{
		return type;
	}
}

class Solution
{
	public static int findMinPriceByType(Flowers obj[],String t)
	{
		List<Integer> p = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getType().equalsIgnoreCase(t) && obj[i].getRating() > 3)
				p.add(obj[i].getPrice());
		}
		if(p.size() != 0)
		{
			p.sort(null);
			return p.get(0);
		}
		else
			return 0;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Flowers flw[] = new Flowers[4];
		for(int i = 0; i < flw.length; i++)
		{
			int flowerId = sc.nextInt();
			sc.nextLine();
			String flowerName = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			int rating = sc.nextInt();
			sc.nextLine();
			String type = sc.nextLine();
			flw[i] = new Flowers(flowerId,flowerName,price,rating,type);
		}
		String t = sc.nextLine();
		int r = findMinPriceByType(flw,t);
		if(r != 0)
		{
			for(int i = 0; i < flw.length; i++)
			{
				if(flw[i].getPrice() == r)
				{
					System.out.println(flw[i].getFlowerId());
				}
			}
		}
		else
			System.out.println("There is no flower with given type");
	}
}
