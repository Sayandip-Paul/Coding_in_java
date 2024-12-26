import java.util.*;
class NavalVessel
{
	private int vesselId;
	private String vesselName;
	private int noOfVoyagesPlanned;
	private int noOfVoyagesCompleted;
	private String purpose;
	private String cf;
	
	public NavalVessel(int vesselId,String vesselName,int noOfVoyagesPlanned,int noOfVoyagesCompleted,String purpose)
	{
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
		this.noOfVoyagesCompleted = noOfVoyagesCompleted;
		this.purpose = purpose;
	}
	
	public int getVesselId()
	{
		return vesselId;
	}
	
	public String getVesselName()
	{
		return vesselName;
	}
	
	public int getNoOfVoyagesPlanned()
	{
		return noOfVoyagesPlanned;
	}
	
	public int getNoOfVoyagesCompleted()
	{
		return noOfVoyagesCompleted;
	}
	
	public String getPurpose()
	{
		return purpose;
	}
	
	public void setClassification(String cf)
	{
		this.cf = cf;
	}
	
	public String getClassification()
	{
		return cf;
	}
}

class Solution
{
	public static int findAvgVoyagesByPct(NavalVessel obj[],int p)
	{
		int cnt = 0;
		int rs = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(((obj[i].getNoOfVoyagesCompleted()*100)/obj[i].getNoOfVoyagesPlanned()) >= p)
			{
				rs = rs + obj[i].getNoOfVoyagesCompleted();
				cnt++;
			}
		}
		if(cnt == 0)
			return 0;
		else
			return rs/cnt;
	}
	
	public static NavalVessel findVesselByGrade(NavalVessel obj[], String p)
	{
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getPurpose().equalsIgnoreCase(p))
			{
				int pn = (obj[i].getNoOfVoyagesCompleted()*100)/obj[i].getNoOfVoyagesPlanned();
				if(pn == 100)
					obj[i].setClassification("Star");
				else if((pn >= 80) && (pn <= 99))
					obj[i].setClassification("Leader");
				else if((pn >= 55) && (pn <= 79))
					obj[i].setClassification("Inspirer");
				else
					obj[i].setClassification("Striver");
				
				return obj[i];
			}
		}
		return null;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		NavalVessel nv[] = new NavalVessel[4];
		
		for(int i = 0; i < nv.length; i++)
		{
			int vesselId = sc.nextInt();
			sc.nextLine();
			String vesselName = sc.nextLine();
			int noOfVoyagesPlanned = sc.nextInt();
			sc.nextLine();
			int noOfVoyagesCompleted = sc.nextInt();
			sc.nextLine();
			String purpose = sc.nextLine();
			nv[i] = new NavalVessel(vesselId,vesselName,noOfVoyagesPlanned,noOfVoyagesCompleted,purpose);
		}
		int pr = sc.nextInt();
		sc.nextLine();
		String ps = sc.nextLine();
		
		System.out.println(findAvgVoyagesByPct(nv,pr));
		NavalVessel ob = findVesselByGrade(nv,ps);
		
		if(ob == null)
			System.out.println("No Naval Vessel is available with the specified purpose");
		else
			System.out.println(ob.getVesselName()+"%"+ob.getClassification());
		
	}
}