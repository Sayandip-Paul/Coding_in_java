import java.util.*;
class Employee
{
	private int id;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(int id,String name,String designation,double salary)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDesignation()
	{
		return designation;
	}
	
	public double getSalary()
	{
		return salary;
	}
}

class Company
{
	private String companyName;
	private Employee emp[];
	private int numEmployees;
	
	public Company(String companyName,int numEmployees,Employee emp[])
	{
		this.companyName = companyName;
		this.numEmployees = numEmployees;
		this.emp = emp;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public int getNumEmployees()
	{
		return numEmployees;
	}
	
	public double getAverageSalary()
	{
		double res = 0.0;
		int cnt = 0;
		for(int i = 0; i < emp.length; i++)
		{
			res = res + emp[i].getSalary();
			cnt++;
		}
		return res/cnt;
	}
	
	public double getMaxSalary()
	{
		List<Double> r = new ArrayList<Double>();
		for(int i = 0; i < emp.length; i++)
		{
			r.add(emp[i].getSalary());
		}
		r.sort(Comparator.reverseOrder());
		return r.get(0);
	}
	
	public String getEmployeesByDesignation(String d)
	{
		String res = "";
		for(int i = 0; i < emp.length; i++)
		{
			if(emp[i].getDesignation().equalsIgnoreCase(d))
			{
				res = res + "ID: " + emp[i].getId() + "Name: " + emp[i].getName() + "Designation: " + emp[i].getDesignation() + "Salary: " + emp[i].getSalary() + "\n";
			}
		}
		return res;
	}
	
}

public class MyClass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String compName = sc.nextLine();
		int n = sc.nextInt();
		
		Employee emp[] = new Employee[n];
		
		for(int i = 0; i < n; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String designation = sc.nextLine();
			double salary = sc.nextDouble();
			sc.nextLine();
			emp[i] = new Employee(id,name,designation,salary);
		}
		String d = sc.nextLine();
		
		Company comp = new Company(compName,n,emp);
		
		System.out.println(comp.getAverageSalary());
		
		System.out.println(comp.getMaxSalary());
		
		System.out.println(comp.getEmployeesByDesignation(d));
	}
}