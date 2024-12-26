/* Java-Second Problem Statement */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Headsets
{
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public Headsets(String headsetName,String brand,int price,boolean available)
    {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public void setHeadsetName(String headsetName)
    {
        this.headsetName = headsetName;
    }

    public String getHeadsetName()
    {
        return headsetName;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public boolean getAvailable()
    {
        return available;
    }
}

public class Solution
{
    public static int findTotalPriceForGivenBrand(Headsets obj[], String brand)
    {
        int sum = 0;
        for(int j = 0; j < obj.length; j++)
        {
            if(obj[j].getBrand().equalsIgnoreCase(brand))
                sum = sum + obj[j].getPrice();
        }
        return sum;
    }

    public static String findAvailableHeadsetWithSecondMinPrice(Headsets obj[]) //available - T
    {
        //Map<String,Integer> dict = new HashMap<String,Integer>();
        String str = "";
        List<Integer> prc = new ArrayList<>();
        for(int k = 0; k < obj.length; k++)
        {
            if(obj[k].getAvailable())
            {
                prc.add(obj[k].getPrice());
            }
        }

        if(prc.isEmpty())
            return str;
        
        prc.sort(null);
        int pr = prc.get(1);

        for(int k = 0; k < obj.length; k++)
        {
            if(obj[k].getAvailable())
            {
                if(obj[k].getPrice() == pr)
                {
                    str = obj[k].getHeadsetName();
                    break;
                }
            }
        }
        return str;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Headsets hs[] = new Headsets[n];
        int pr = 0;
        for(int i = 0; i< n; i++)
        {
            String headsetName = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            boolean available = sc.nextBoolean();
            sc.nextLine();

            hs[i] = new Headsets(headsetName,brand,price,available);
        }
        // for(Headsets obj: hs)
            // System.out.println(obj.getHeadsetName() + " : " + obj.getBrand() + " : " + obj.getPrice() + " : " + obj.getAvailable());
        String inputBrand = sc.nextLine();
        String res = "";
        int p = findTotalPriceForGivenBrand(hs,inputBrand);
        if(p == 0)
            System.out.println("No headsets available with the given brand");
        else
            System.out.println(p);
        
        res = findAvailableHeadsetWithSecondMinPrice(hs);
        
        
        if(res.equals(""))
        {
            System.out.println("No Headsets Found");
        }
        else
        {
            for(int k = 0; k < hs.length; k++)
            {
                if(hs[k].getHeadsetName().equals(res))
                    pr = hs[k].getPrice();
            }
            System.out.println(res);
            System.out.println(pr);
        }
    }
}




