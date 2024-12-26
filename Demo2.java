/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."
153 (3-digit number):

1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
*/
import java.util.*;
public class Demo2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int n = Integer.parseInt(num);
        int p = num.length();
        double r = 0.0;
        
        for(int i = 0; i < p; i++)
        {
            r = r + Math.pow(Character.getNumericValue(num.charAt(i)),p);
        }
        
        int res = (int) r;
        if(res == n)
            System.out.println("Yes, the number is an Armstrong number.");
        else
            System.out.println("No, the number is not an Armstrong number.");
    }
}

