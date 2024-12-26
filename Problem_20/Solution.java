import java.util.*;

class Laptop 
{
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) 
	{
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId() 
	{
        return laptopId;
    }

    public String getBrand() 
	{
        return brand;
    }

    public String getOsType() 
	{
        return osType;
    }

    public double getPrice() 
	{
        return price;
    }

    public int getRating() 
	{
        return rating;
    }
}

class Solution
{
    public static int countOfLaptopsByBrand(Laptop obj[], String b) 
	{
        int cnt = 0;
        for (int i = 0; i < obj.length; i++) 
		{
            if ((obj[i].getBrand().equalsIgnoreCase(b)) && (obj[i].getRating() > 3)) 
			{
                cnt = cnt + 1;
            }
        }
        if (cnt == 0) 
			return 0;
        else 
			return cnt;
    }

    public static List<Integer> searchLaptopByOsType(Laptop obj[], String os) 
	{
        List<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < obj.length; i++) 
		{
            if (obj[i].getOsType().equalsIgnoreCase(os)) 
			{
                r.add(obj[i].getLaptopId());
            }
        }
        r.sort(Comparator.reverseOrder());
        if (r.size() == 0) 
			return null;
        else 
			return r;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        List<Integer> id = new ArrayList<Integer>();
        Laptop lap[] = new Laptop[4];
        for (int i = 0; i < 4; i++) 
		{
            int laptopId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            double price = sc.nextDouble();
            int rating = sc.nextInt();
            sc.nextLine();
            lap[i] = new Laptop(laptopId, brand, osType, price, rating);
        }

        String br = sc.nextLine();
        String os = sc.nextLine();

        int res = countOfLaptopsByBrand(lap, br);
        if (res == 0)
            System.out.println("The given brand is not available");
        else
            System.out.println(res);

        id = searchLaptopByOsType(lap, os);
        if (id != null) 
		{
            for (int each : id) 
			{
                System.out.println(each);
                for (int i = 0; i < lap.length; i++) 
				{
                    if (lap[i].getLaptopId() == each) 
					{
                        System.out.println(lap[i].getRating());
                    }
                }
            }
        } 
		else 
		{
            System.out.println("The given os is not available");
        }
    }
}


