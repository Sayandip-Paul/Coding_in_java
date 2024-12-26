import java.util.*;
class AutonomousCar
{
	private int carId;
	private String brand;
	private int noOfTestsConducted;
	private int noOfTestsPassed;
	private String environment;
	private String grade;
	
	public AutonomousCar(int carId,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment)
	{
		this.carId = carId;
		this.brand = brand;
		this.noOfTestsConducted = noOfTestsConducted;
		this.noOfTestsPassed = noOfTestsPassed;
		this.environment = environment;
	}
	
	public int getCarId()
	{
		return carId;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getNoOfTestsConducted()
	{
		return noOfTestsConducted;
	}
	
	public int getNoOfTestsPassed()
	{
		return noOfTestsPassed;
	}
	
	public String getEnvironment()
	{
		return environment;
	}
	
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	
	public String getGrade()
	{
		return grade;
	}
}

class Solution
{
	public static int findTestPassedByEnv(AutonomousCar obj[],String env)
	{
		int s = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getEnvironment().equals(env))
			{
				s = s + obj[i].getNoOfTestsPassed();
			}
		}
		
		if(s != 0)
			return s;
		else
			return 0;
	}
	
	public static AutonomousCar updateCarGrade(AutonomousCar obj[],String b)
	{
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getBrand().equals(b))
			{
				int rating = (obj[i].getNoOfTestsPassed()/obj[i].getNoOfTestsConducted())*100;
				if(rating >= 80)
					obj[i].setGrade("A1");
				else
					obj[i].setGrade("B2");
				
				return obj[i];
			}
			
		}
		return null;
	}

	public static void main(String args[])
	{
		AutonomousCar c[] = new AutonomousCar[4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++)
		{
			int carId = sc.nextInt();
			sc.nextLine();
			String brand = sc.nextLine();
			int noOfTestsConducted = sc.nextInt();
			sc.nextLine();
			int noOfTestsPassed = sc.nextInt();
			sc.nextLine();
			String environment = sc.nextLine();
			c[i] = new AutonomousCar(carId,brand,noOfTestsConducted,noOfTestsPassed,environment);
		}
		String e = sc.nextLine();
		String br = sc.nextLine();
		int r = findTestPassedByEnv(c,e);
		AutonomousCar car = updateCarGrade(c,br);
		
		if(r != 0)
			System.out.println(r);
		else
			System.out.println("There are no tests passed in this particular environment.");
		
		if(car != null)
			System.out.println(car.getBrand() + "::" + car.getGrade());
		else
			System.out.println("No Car is available with the specified brand");
	}
}