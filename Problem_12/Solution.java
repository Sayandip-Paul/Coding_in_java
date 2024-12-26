import java.util.*;
class Employee
{
	private int employeeId;
	private String name;
	private String branch;
	private double rating;
	private boolean companyTransport;
	
	public Employee(int employeeId,String name,String branch,double rating,boolean companyTransport)
	{
		this.employeeId = employeeId;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.companyTransport = companyTransport;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	
	public void setRating(double rating)
	{
		this.rating = rating;
	}
	
	public void setCompanyTransport(boolean companyTransport)
	{
		this.companyTransport = companyTransport;
	}
	
	// --------------
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBranch()
	{
		return branch;
	}
	
	public double getRating()
	{
		return rating;
	}
	
	public boolean getCompanyTransport()
	{
		return companyTransport;
	}
}

class Solution
{
	public static int findCountOfEmployeesUsingCompTransport(Employee obj[],String brch)
	{
		int cnt = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getCompanyTransport() == true)
			{
				if(obj[i].getBranch().equals(brch))
				{
					cnt++;
				}
			}
		}
		if(cnt == 0)
			return 0;
		else
			return cnt;
	}
	
	public static Employee findEmployeeWithSecondHighestRating(Employee obj[])
	{
		List<Double> r = new ArrayList<Double>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getCompanyTransport() == false)
			{
				r.add(obj[i].getRating());
			}
		}
		r.sort(null);
		double s = r.get(r.size()-2);
		for(int i = 0; i < obj.length; i++)
		{
			if((obj[i].getCompanyTransport() == false) && (obj[i].getRating() == s))
			{
				return obj[i];
			}
		}
		return null;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Employee emp[] = new Employee[n];
		for(int i = 0; i < n; i++)
		{
			int employeeId = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String branch = sc.nextLine();
			double rating = sc.nextDouble();
			boolean companyTransport = sc.nextBoolean();
			sc.nextLine();
			emp[i] = new Employee(employeeId,name,branch,rating,companyTransport);
		}
		String b = sc.nextLine();
		int r = findCountOfEmployeesUsingCompTransport(emp,b);
		
		if(r > 0)
			System.out.println(r);
		else
			System.out.println("No such Employees");
		
		Employee e = findEmployeeWithSecondHighestRating(emp);
		if(e == null)
			System.out.println("All Employees using company transport");
		else
			System.out.println(e.getEmployeeId());
			System.out.println(e.getName());
		
	}
}