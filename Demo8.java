/* Count number of vowel, consonent and digit into a string */
import java.util.*;
public class Demo8
{
    public static Boolean isVowel(char c)
    {
        if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
        {
            return true;
        }
        return false;
    }

    public static Boolean isDigit(char c)
    {
        if((c == '0') || (c == '1') || (c == '2') || (c == '3') || (c == '4') || (c == '5') || (c == '6') || (c == '7') || (c == '8') || (c == '9'))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int v = 0;
        int c = 0;
        int d = 0;
        for(int i = 0; i < num.length(); i++)
        {
            if(isVowel(num.charAt(i)))
                v++;
            if(isVowel(num.charAt(i)) == false)
                c++;
            if(isDigit(num.charAt(i)))
                d++;
        }
        System.out.println("Number of vowels: " + v);
        System.out.println("Number of consonents: " + c);
        System.out.println("Number of digits: " + d);
    }
}
