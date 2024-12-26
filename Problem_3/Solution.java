
/*
 * 
2
Java - First Problem Statement
Question:
Write main method in Solution class.
In the main method, read a string and find the count of words starting with a 
vowel in the string. If no words are present in the String value then it should 
print "No String found".
Note:
All search should be case insensitive.
Sample input1:
Everyone should practice and learn to became professional.
Output: 2
Sample input2: hi guys
Output:
No String found
 */
import java.util.Scanner;
public class Solution 
{
    public static void main(String args[])
    {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1[] = str.split(" ");
        int cnt = 0;
        for(String each: str1)
            if(each.toLowerCase().startsWith("a") || (each.toLowerCase().startsWith("e")) || (each.toLowerCase().startsWith("i")) || (each.toLowerCase().startsWith("o")) || (each.toLowerCase().startsWith("u")))
                cnt++;
        
        if(cnt == 0)
            System.out.println("No String found");
        else
            System.out.println(cnt);
    }
}