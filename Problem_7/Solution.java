import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Document
{
    private int id;
    private String title;
    private String folderName;
    private int pages;
    
    public Document(int id,String title,String folderName,int pages)
    {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setFolderName(String folderName)
    {
        this.folderName = folderName;
    }
    
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getFolderName()
    {
        return folderName;
    }
    
    public int getPages()
    {
        return pages;
    }
}

public class Solution 
{
    public static List<Document> docsWithOddPages (Document obj[])
    {
        List<Document> ob = new ArrayList<Document>();
        for(int j = 0; j < obj.length;j++)
        {
            if(obj[j].getPages() % 2 != 0)
            {
                ob.add(obj[j]);
            }
        }
        
        return ob;
    }
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        Document doc[] = new Document[4];
        List<Integer> d = new ArrayList<Integer> ();
        int cnt = 0;
        for(int i = 0; i < doc.length; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String folderName = sc.nextLine();
            int pages = sc.nextInt();
            //sc.nextLine();
            doc[i] = new Document(id,title,folderName,pages);
        }
        for(Document each: docsWithOddPages(doc))
        {
            d.add(each.getId());
            cnt++;
        }
        d.sort(null);
        
        for(int c = 0; c < cnt; c++ )
        {
            for(Document each: docsWithOddPages(doc))
            {
                if(d.get(c) == each.getId())
                {
                    System.out.println(each.getId() + " " + each.getTitle() + " " + each.getFolderName() + " " + each.getPages());
                }
            }
        }
        
    }
}