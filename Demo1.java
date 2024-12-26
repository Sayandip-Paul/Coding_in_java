/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/
import java.util.*;
public class Demo1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s[] = str.split(" ");
        String res = "";
        for(String each: s)
        {
            for(int i = 0; i < each.length(); i++)
            {
                if(i % 2 != 0)
                {
                    res = res + each.charAt(i);
                }
            }
        }
        System.out.println(res);
    }
}

