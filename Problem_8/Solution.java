import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Book
{
    private int id;
    private String title;
    private String author;
    private double price;
    
    public Book(int id,String title,String author,double price)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public Double getPrice()
    {
        return price;
    }
}

public class Solution 
{
    public static List<Book> sortBooksByPrice(Book obj[])
    {
        List<Double> prc = new ArrayList<Double> ();
        List<Book> ob = new ArrayList<Book> ();
        int cnt = 0;
        for(Book each: obj)
        {
            prc.add(each.getPrice());
            cnt++;
        }
        prc.sort(null);
        //System.out.println(prc);
        //int ct = 0;
        //System.out.println(prc);
        for(int j = 0; j < cnt; j++)
        {
            for(Book ec: obj)
            {
                if(prc.get(j) == ec.getPrice())
                {
                    ob.add(ec);
                    //System.out.println(ct);
                }
            }
        }
        return ob;
    }
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        Book b[] = new Book[4];
        List<Book> res = new ArrayList<Book> ();
        for(int i = 0; i < b.length;i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            Double price = sc.nextDouble();
            //sc.nextLine();
            b[i] = new Book(id,title,author,price);
        }
        res = sortBooksByPrice(b);
        
        for(Book each: res)
        {
            System.out.println(each.getId() + " " + each.getTitle() + " " + each.getAuthor() + " " + each.getPrice());
        } 
    }
}