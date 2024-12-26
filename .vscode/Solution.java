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
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	
	public void setSalary(double salary)
	{
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
	private int numEmployees;
	private Employee emp[];
	
	public Company(String companyName,int numEmployees,Employee emp[])
	{
		this.companyName = companyName;
		this.numEmployees = numEmployees;
		this.emp = emp;
	}
	
	public double getAverageSalary()
	{
		double s = 0;
		for(int i = 0; i < emp.length; i++)
		{
			s = s + emp[i].getSalary();
		}
		return s/emp.length;
	}
	
	public double getMaxSalary()
	{
		List<Double>sal = new ArrayList<Double>();
		for(int i = 0; i < emp.length; i++)
		{
			sal.add(emp[i].getSalary());
		}
		sal.sort(null);
		return sal.get(sal.size()-1);
	}
	
	public String getEmployeesByDesignation(String des)
	{
		String res = "";
		for(int i = 0; i < emp.length; i++)
		{
			if(emp[i].getDesignation().equalsIgnoreCase(des))
			{
				res = res + "ID: " + emp[i].getId() + " Name: " + emp[i].getName() + " Designation: " + emp[i].getDesignation() + " Salary: " + emp[i].getSalary() + "\n"; 
			}
		}
		if(res == null)
			return "Null";
		else
			return res;
	}
}

class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String compName = sc.nextLine();
		int num = sc.nextInt();
		//sc.nextLine();
		Employee emp[] = new Employee[num];
		for(int i = 0; i < num; i++)
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
		Company comp = new Company(compName,num,emp);
		
		double res = comp.getAverageSalary();
		double m = comp.getMaxSalary();
		String r = comp.getEmployeesByDesignation(d);
		System.out.println(res);
		System.out.println(m);
		System.out.println(r);
	}
}