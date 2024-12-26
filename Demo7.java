/*
 * Check if the input number is prime number of not
 */
import java.util.*;
public class Demo7
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
        int num = sc.nextInt();
        if(isPrime(num))
            System.out.println("prime");
        else
            System.out.println("Not Prime");
    }
}

