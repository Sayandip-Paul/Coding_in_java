/*
 * Given a string,s, and an integer,k, complete the function so that it finds the 
 * lexicographically smallest and largest substrings of length n.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .
 */

import java.util.*;

public class Demo11
{
    
    
    public static String getSmallestAndLargest(String str,int n)
    {
        String s = str.substring(0,n);
        String l = str.substring(0,n);
        
        for(int i = 0; i <= str.length() - n; i++)
        {
            String sub = str.substring(i, i+n);
            
            if(sub.compareTo(s) < 0)
                s = sub;
            
            if(sub.compareTo(l) > 0)
                l = sub;
        }
        
        return s + "\n" + l;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(getSmallestAndLargest(str,n));
    }
}