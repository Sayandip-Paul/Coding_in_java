/*
 * Two strings, a and b+, are called anagrams if they contain all the same characters in the same 
 * frequencies. For this challenge, the test is not case-sensitive. 
 * For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
 */

import java.util.*;

public class Demo13
{
    public static Boolean isAnagram(String x,String y)
    {
        x = x.toLowerCase();
        y = y.toLowerCase();
        if(x.length() != y.length())
            return false;
        
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(isAnagram(a,b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}