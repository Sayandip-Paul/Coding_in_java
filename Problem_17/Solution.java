import java.util.*;
class Phone
{
	private int phoneId;
	private String os; 
	private String brand; 
	private int price;
	
	public Phone(int phoneId,String os,String brand,int price)
	{
		this.phoneId = phoneId;
		this.os = os;
		this.brand = brand;
		this.price = price;
	}
	
	public int getPhoneId()
	{
		return phoneId;
	}
	
	public String getOS()
	{
		return os;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getPrice()
	{
		return price;
	}
}

class Solution
{
	public static int findPriceForGivenBrand(Phone obj[],String br)
	{
		int s  = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getBrand().equalsIgnoreCase(br))
			{
				s = s + obj[i].getPrice();
			}
		}
		if(s != 0)
			return s;
		else
			return 0;
	}
	
	public static Phone getPhoneIdBasedOnOs(Phone obj[],String os)
	{
		for(int i = 0; i < obj.length; i++)
		{
			if((obj[i].getOS().equalsIgnoreCase(os)) && (obj[i].getPrice() >= 50000))
				return obj[i];
		}
		return null;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Phone ph[] = new Phone[num];
		
		for(int i = 0; i < ph.length; i++)
		{
			int phoneId = sc.nextInt();
			sc.nextLine();
			String os = sc.nextLine();
			String brand = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			ph[i] = new Phone(phoneId,os,brand,price);
		}
		String b = sc.nextLine();
		String o = sc.nextLine();
		int p = findPriceForGivenBrand(ph,b);
		Phone ob = getPhoneIdBasedOnOs(ph,o);
		if(p > 0)
			System.out.println(p);
		else
			System.out.println("The given Brand is not available");
		
		if(ob != null)
			System.out.println(ob.getPhoneId());
		else
			System.out.println("No phones are available with specified os and price range");
		
	}
}