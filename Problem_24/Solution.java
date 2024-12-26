import java.util.*;
class Antenna
{
	private int antennaId;
	private String antennaName;
	private String projectLead;
	private double antennaVSWR;
	
	public Antenna(int antennaId,String antennaName,String projectLead,double antennaVSWR)
	{
		this.antennaId = antennaId;
		this.antennaName = antennaName;
		this.projectLead = projectLead;
		this.antennaVSWR = antennaVSWR;
	}
	
	public int getAntennaId()
	{
		return antennaId;
	}
	
	public String getAntennaName()
	{
		return antennaName;
	}
	
	public String getProjectLead()
	{
		return projectLead;
	}
	
	public double getAntennaVSWR()
	{
		return antennaVSWR;
	}
}

class Solution
{
	public static int searchAntennaByName(Antenna obj[],String a)
	{
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getAntennaName().equalsIgnoreCase(a))
			{
				return obj[i].getAntennaId();
			}
		}
		return 0;
	}
	
	public static List<Double> sortAntennaByVSWR(Antenna obj[],double v)
	{
		List<Double> r = new ArrayList<Double>();
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getAntennaVSWR() < v)
			{
				r.add(obj[i].getAntennaVSWR());
			}
		}
		r.sort(null);
		if(r.size() == 0)
			return null;
		else
			return r;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Antenna ant[] = new Antenna[4];
		List<Double> d = new ArrayList<Double>();
		for(int i = 0; i < ant.length; i++)
		{
			int antennaId = sc.nextInt();
			sc.nextLine();
			String antennaName = sc.nextLine();
			String projectLead = sc.nextLine();
			double antennaVSWR = sc.nextDouble();
			sc.nextLine();
			ant[i] = new Antenna(antennaId,antennaName,projectLead,antennaVSWR);
		}
		
		String aName = sc.nextLine();
		double aVswr = sc.nextDouble();
		
		int r = searchAntennaByName(ant,aName);
		d = sortAntennaByVSWR(ant,aVswr);
		if(r == 0)
			System.out.println("There is no antenna with the given parameter");
		else
			System.out.println(r);
		
		if(d != null)
		{
			for(double each: d)
			{
				for(int i = 0; i < ant.length; i++)
				{
					if(each == ant[i].getAntennaVSWR())
					{
						System.out.println(ant[i].getProjectLead());
					}
				}
			}
		}
		else
			System.out.println("No Antenna found");
	}
}
