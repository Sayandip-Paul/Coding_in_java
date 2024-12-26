/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads 
 * the same backward or forward.

Given a string s, print Yes if it is a palindrome, print No otherwise.
 */
import java.io.*;
import java.util.*;

public class Demo12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        List<String> s = new ArrayList<String> ();
        for(int i = str.length() - 1; i >= 0;i--)
        {
            s.add(Character.toString(str.charAt(i)));
        }
        for(String each:s)
            res = res + each;
        
        if(str.equals(res))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}