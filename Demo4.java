//How many times a character repeats itself;
// aabbbcc = a2b3c2
// abbccc = a1b2c3
import java.util.*;
public class Demo4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<String> st = new HashSet<String>();
        int cnt = 0;
        String res = "";
        for(int i = 0; i < str.length(); i++)
        {
            st.add(Character.toString(str.charAt(i)));
        }
        
        Object s[] = st.toArray();
        
        for(int k = 0; k < s.length; k++)
        {
            for(int j = 0; j < str.length();j++)
            {
                if(Character.toString(str.charAt(j)).equals(s[k]))
                {
                    cnt++;
                }
            }
            res = res + s[k] + Integer.toString(cnt);
            cnt = 0;
        }
        System.out.println(res);
    }
}

