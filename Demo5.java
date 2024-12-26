/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Ghosh
 * Output: hs
 */
import java.util.*;
public class Demo5 
{
    public static Boolean isConsonent(char c)
    {
        if((c != 'a') && (c != 'e') && (c != 'i') && (c != 'o') && (c != 'u'))
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String res = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(i % 2 != 0)
            {
                if(isConsonent(str.charAt(i)))
                {
                    res = res + Character.toString(str.charAt(i));
                }
            }
        }
        System.out.println(res);
    }
}
