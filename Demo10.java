import java.util.*; 
public class Demo10
{ 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in); 
		int num[] = new int[5]; 
		for(int i = 0; i < 5; i++) 
		{ 
			num[i] = sc.nextInt(); 
			sc.nextLine(); 
		} 
		int a = sc.nextInt(); 
		sc.nextLine(); 
		int b = sc.nextInt(); 
		int s = 0; int cnt = 0; 
		for(int j = 0; j < 5; j++) 
		{ 
			if((num[j] > a) && (num[j] < b)) 
			{ 
				s = s + num[j]; cnt++; 
			}
		} 
		int res = (int)(s/cnt); 
		System.out.println(res); 
	} 
}