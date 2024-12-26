import java.util.*;
public class Solution
{
	public static boolean isVowel(char c)
	{
		String s = Character.toString(c);
		if((s.equalsIgnoreCase("a")) || (s.equalsIgnoreCase("e")) || (s.equalsIgnoreCase("i")) || (s.equalsIgnoreCase("o")) || (s.equalsIgnoreCase("u")))
			return true;
		
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<Character> r = new ArrayList<Character>();
		String s = sc.nextLine();
		
		char c[] = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(isVowel(s.charAt(i)))
			{
				r.add(s.charAt(i));
			}
		}
		
		int vowelIndex = r.size()-1;
		
		for(int i = 0; i < c.length; i++)
		{
			if(isVowel(c[i]))
			{
				c[i] = r.get(vowelIndex);
				vowelIndex--;
			}
		}
		
		if(c.length != 0)
			System.out.println(new String(c));
		else
			System.out.println("Empty String");
	}
}