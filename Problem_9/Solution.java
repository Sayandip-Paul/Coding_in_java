import java.util.*;
class Employee
{
	private int employeeId;
	private String employeeName;
	private int age;
	private char gender;
	private double salary;
	
	public Employee(int employeeId,String employeeName,int age,char gender,double salary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	
	public void setEmployeeId()
	{
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName()
	{
		this.employeeName = employeeName;
	}
	
	public void setGender()
	{
		this.gender = gender;
	}
	
	public void setSalary()
	{
		this.salary = salary;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public double getSalary()
	{
		return salary;
	}
}

class Solution
{
	public static Employee getEmployeeWithSecondLowestSalary(Employee obj[])
	{
		Set<Double> sal1 = new HashSet<Double>();
		for(int i = 0; i < obj.length; i++)
		{
			sal1.add(obj[i].getSalary()); 
		}
		List<Double> sal = new ArrayList<Double>(sal1);
		sal.sort(null);
		double s = sal.get(1);
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getSalary() == s)
				return obj[i];
		}
		return null;
	}
	
	public static Employee getEmployeeWithSecondHighestSalary(Employee obj[])
	{
		Set<Double> sal1 = new HashSet<Double>();
		for(int i = 0; i < obj.length; i++)
		{
			sal1.add(obj[i].getSalary());
		}
		List<Double>sal = new ArrayList<Double>(sal1);
		sal.sort(null);
		double s = sal.get(sal.size()-2);
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getSalary() == s)
				return obj[i];
		}
		return null;
	}
	
	public static int countEmployeesBasedOnAge(Employee obj[],int a)
	{
		int cnt = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getAge() == a)
				cnt++;
		}
		if(cnt == 0)
			return 0;
		else
			return cnt;
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
			String employeeName = sc.nextLine();
			int age = sc.nextInt();
			sc.nextLine();
			String gen = sc.nextLine();
			char gender = gen.charAt(0);
			double salary = sc.nextDouble();
			emp[i] = new Employee(employeeId,employeeName,age,gender,salary);
		}
		int g = sc.nextInt();
		Employee emp1 = getEmployeeWithSecondLowestSalary(emp);
		Employee emp2 = getEmployeeWithSecondHighestSalary(emp);
		System.out.println("Employee with second lowest salary");
		if(emp1 == null)
			System.out.println("Null");
		else
			System.out.println(emp1.getEmployeeId() + "#" + emp1.getEmployeeName());
		System.out.println("---------------------------------------");
		System.out.println("Employee with second highest salary");
		if(emp2 == null)
			System.out.println("Null");
		else
			System.out.println(emp2.getEmployeeId() + "#" + emp2.getEmployeeName());
		System.out.println("Number of employees with the given age");
		int c = countEmployeesBasedOnAge(emp,g);
		if(c == 0)
			System.out.println("No employees found for the given age");
		else
			System.out.println(c);
	}
}

