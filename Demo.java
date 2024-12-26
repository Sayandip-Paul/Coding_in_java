/*Count the number of words in a sentence that contain at least two 
consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:
Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2
Explanation: There are two words in the sentence that contain at least two consecutive vowels - 
"eating" and "meatballs".
 */
import java.util.*;
public class Demo
{
    public static Boolean isVowel(char c)
    {
        if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String s[] = str.split(" ");
        int cnt = 0;

        for(int i = 0; i < s.length;i++)
        {
            for(int j = 1; j < s[i].length(); j++)
            {
                if(isVowel(s[i].charAt(j-1)) && isVowel(s[i].charAt(j)))
                {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);

    }
}

