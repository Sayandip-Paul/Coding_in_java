import java.util.*;
class Projector
{
	private int projectorId; 
	private String projectorName;
	private int price;
	private int rating;
	private String availableIn;
	
	public Projector(int projectorId,String projectorName,int price,int rating,String availableIn)
	{
		this.projectorId = projectorId;
		this.projectorName = projectorName;
		this.price = price;
		this.rating = rating;
		this.availableIn = availableIn;
	}
	
	public int getProjectorId()
	{
		return projectorId;
	}
	
	public String getProjectorName()
	{
		return projectorName;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public String getAvailableIn()
	{
		return availableIn;
	}
}

class Solution
{
	public static int MaximumPriceByRating(Projector obj[],int r)
	{
		List<Integer> d = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(((obj[i].getAvailableIn().equalsIgnoreCase("Tata Cliq")) || (obj[i].getAvailableIn().equalsIgnoreCase("TataCliq"))) && (obj[i].getRating() > r))
			{
				d.add(obj[i].getPrice());
			}
		}
		
		if(d.size() != 0)
		{
			d.sort(Comparator.reverseOrder());
			return d.get(0);
		}
		else
			return 0;
			
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Projector prj[] = new Projector[4];
		
		for(int i = 0; i < prj.length; i++)
		{
			int projectorId = sc.nextInt();
			sc.nextLine();
			String projectorName = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			int rating = sc.nextInt();
			sc.nextLine();
			String availableIn = sc.nextLine();
			prj[i] = new Projector(projectorId,projectorName,price,rating,availableIn);
		}
		int r = sc.nextInt();
		
		int m = MaximumPriceByRating(prj,r);
		if(m != 0)
		{
			for(int i = 0; i < prj.length; i++)
			{
				if(prj[i].getPrice() == m)
					System.out.println(prj[i].getProjectorId());
			}
		}
		else
			System.out.println("No such Projector");
	}
}
