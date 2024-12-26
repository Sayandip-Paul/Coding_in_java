
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

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public void setSalary(double salary)
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
    public static int countEmployeesBasedOnAge(Employee obj[], int a)
    {
        int cnt = 0;
        for(Employee each: obj)
        {
            if(each.getAge() == a)
            {
                cnt++;
            }
        }
        if(cnt != 0)
        {
            return cnt;
        }
        else
        {
            return 0;
        }
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee obj[])
    {
        List<Double> sal = new ArrayList<Double>();
        if(obj.length < 2)
        {
            return null;
        }
        for(int j = 0; j < obj.length; j++)
        {
            sal.add(obj[j].getSalary());
        }
        sal.sort(null); // for ascending order
        // sal.reversed(); // for descending order
        double salr = sal.get(1);
        for(int k = 0; k < obj.length; k++)
        {
            if(obj[k].getSalary() == salr)
            {
                return obj[k];
            }
        }
        return null;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Employee emp[] = new Employee[n];  // Important Line
        for(int i = 0; i<n; i++)
        {
            int employeeId = sc.nextInt();
            sc.nextLine();
            String employeeName = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char gender = sc.nextLine().charAt(0);
            double salary = sc.nextDouble();
            emp[i] = new Employee(employeeId,employeeName,age,gender,salary); // Important Line
        }
        int ag = sc.nextInt();
        sc.nextLine();
        Employee ob = getEmployeeWithSecondLowestSalary(emp);
        if(ob != null)
        {
            System.out.println("#" + ob.getEmployeeId() + ob.getEmployeeName());
        }
        else
        {
            System.out.println("Null");
        }
        int c = countEmployeesBasedOnAge(emp,ag);
        if(c > 0)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println("No employee found for the given age");
        }
    }
}


