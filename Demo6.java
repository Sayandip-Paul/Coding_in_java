/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class Demo6
{
    public static Boolean isPrime(int n)
    {
        int i = n - 1;
        if(n == 1)
            return false;
        if(n == 2)
            return true;
        while(i > 1)
        {
            if(n % i == 0)
                return false;
            i = i - 1;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int cnt = 0;
        for(int j = 0; j < num.length(); j++)
        {
            if(isPrime(Character.getNumericValue((num.charAt(j)))))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

