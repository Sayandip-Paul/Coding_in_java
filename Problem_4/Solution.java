import java.util.Scanner;
class Resort
{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId,String resortName,String category,double price,double rating)
    {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public void setResortId(int resortId)
    {
        this.resortId = resortId;
    }

    public void setResortName(String resortName)
    {
        this.resortName = resortName;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public int getResortId()
    {
        return resortId;
    }

    public String getResortName()
    {
        return resortName;
    }

    public String getCategory()
    {
        return category;
    }

    public double getPrice()
    {
        return price;
    }

    public double getRating()
    {
        return rating;
    }
}

public class Solution
{
    public static double findAvgPriceByCategory(Resort obj[],String inputCat)
    {
        double sum = 0;
        int cnt = 0;
        for(int j = 0; j < obj.length;j++)
        {
            if((obj[j].getCategory().equalsIgnoreCase(inputCat)) && (obj[j].getRating() > 4.0))
            {
                sum = sum + obj[j].getPrice();
                cnt = cnt + 1;
            }
        }
        return sum/cnt;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int n = sc.nextInt();
        sc.nextLine();
        Resort rs[] = new Resort[n];  // Making an object array

        for(int i = 0; i < n; i++)
        {
            //int resortId,String resortName,String category,double price,double rating
            int resortId = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            sc.nextLine();

            rs[i] = new Resort(resortId,resortName,category,price,rating);
        }
        str = sc.nextLine();
        double res = findAvgPriceByCategory(rs,str);
        if(res > 0)
            System.out.println("Average price of the " + str + " Resort: " + res);
        else
            System.out.println("There are no such available resort");
        //for(Resort each: rs)
            //System.out.println(each.getResortId() + " -> " + each.getResortName() + " -> " + each.getCategory() + " -> " + each.getPrice() + " -> " + each.getRating());
    }
}

