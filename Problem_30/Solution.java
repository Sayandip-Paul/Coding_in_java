import java.util.*;
class Fruits
{
	private int fruitId;
	private String fruitName;
	private int price;
	private int rating;
	
	public Fruits(int fruitId,String fruitName,int price,int rating)
	{
		this.fruitId = fruitId;
		this.fruitName = fruitName;
		this.price = price;
		this.rating = rating;
	}
	
	public int getFruitId()
	{
		return fruitId;
	}
	
	public String getFruitName()
	{
		return fruitName;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getRating()
	{
		return rating;
	}
}

public class Solution
{
	public static int findMaximumPriceByRating(Fruits obj[],int r)
	{
		List<Integer> p = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getRating() > r)
			{
				p.add(obj[i].getPrice());
			}
		}
		if(p.size() != 0)
		{
			p.sort(Comparator.reverseOrder());
			return p.get(0);
		}
		else
			return 0;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Fruits f[] = new Fruits[4];
		
		for(int i = 0; i < f.length; i++)
		{
			int fruitId = sc.nextInt();
			sc.nextLine();
			String fruitName = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			int rating = sc.nextInt();
			sc.nextLine();
			f[i] = new Fruits(fruitId,fruitName,price,rating);
		}
		int r = sc.nextInt();
		
		int p = findMaximumPriceByRating(f,r);
		
		if(p != 0)
		{
			for(int i = 0; i < f.length; i++)
			{
				if(f[i].getPrice() == p)
					System.out.println(f[i].getFruitId());
			}
		}
		else
			System.out.println("No such Fruit");
	}
}