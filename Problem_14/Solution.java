import java.util.*;
class Medicine
{
	private String medicineName; 
	private String batch; 
	private String disease;
	private int price;
	
	public Medicine(String medicineName,String batch,String disease,int price)
	{
		this.medicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	
	public void setMedicineName(String medicineName)
	{
		this.medicineName = medicineName;
	}
	
	public void setBatch(String batch)
	{
		this.batch = batch;
	}
	
	public void setDisease(String disease)
	{
		this.disease = disease;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	// --------------------
	
	public String getMedicineName()
	{
		return medicineName;
	}
	
	public String getBatch()
	{
		return batch;
	}
	
	public String getDisease()
	{
		return disease;
	}
	
	public int getPrice()
	{
		return price;
	}
}

class Solution
{
	public static List<Integer> getPriceByDisease(Medicine obj[],String d)
	{
		List<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getDisease().equalsIgnoreCase(d))
			{
				r.add(obj[i].getPrice());
			}
		}
		r.sort(null);
		return r;
	}
 	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<Integer> s = new ArrayList<Integer>();
		Medicine m[] = new Medicine[n];
		for(int i = 0; i < n; i++)
		{
			String medicineName = sc.nextLine();
			String batch = sc.nextLine();
			String disease = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			m[i] = new Medicine(medicineName,batch,disease,price);
		}
		String d = sc.nextLine();
		s = getPriceByDisease(m,d);
		for(int j = 0; j < s.size(); j++)
			System.out.println(s.get(j));
	}
}