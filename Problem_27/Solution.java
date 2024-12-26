import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = 0;
		int cnt = 0;
		while(num > 0)
		{
			r = num % 10;
			if(r % 2 != 0)
				cnt++;
			
			num = num / 10;
		}
		if(cnt >= 3)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}