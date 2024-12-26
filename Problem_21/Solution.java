import java.util.*;

class Hotel 
{
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) 
	{
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() 
	{
        return hotelId;
    }

    public String getHotelName() 
	{
        return hotelName;
    }

    public String getDateOfBooking() 
	{
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() 
	{
        return noOfRoomsBooked;
    }

    public String getWifiFacility() 
	{
        return wifiFacility;
    }

    public double getTotalBill() 
	{
        return totalBill;
    }
}

class Solution
{
    public static int noOfRoomsBookedInGivenMonth(Hotel obj[], String m) 
	{
        int res = 0;
        String n[];
        String p = "";

        for (int i = 0; i < obj.length; i++) 
		{
            n = obj[i].getDateOfBooking().split("-");
            p = n[1].toLowerCase();
            if (p.equals(m)) 
			{
                res = res + obj[i].getNoOfRoomsBooked();
            }
        }
        if (res == 0) 
		{
            return 0;
        } 
		else 
		{
            return res;
        }
    }

    public static int searchHotelByWifiOption(Hotel obj[], String w) 
	{
        List<Double> r = new ArrayList<Double>();

        for (int i = 0; i < obj.length; i++) 
		{
            if (obj[i].getWifiFacility().equalsIgnoreCase(w)) 
			{
                r.add(obj[i].getTotalBill());
            }
        }
        r.sort(Comparator.reverseOrder());

        if (r.size() != 0) 
		{
            double a = r.get(1);
            for (int j = 0; j < obj.length; j++) 
			{
                if (obj[j].getTotalBill() == a) 
				{
                    return obj[j].getHotelId();
                }
            }
        }
        return 0;
    }

    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        Hotel h[] = new Hotel[4];

        for (int i = 0; i < h.length; i++) 
		{
            int hotelId = sc.nextInt();
            sc.nextLine();
            String hotelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String wifiFacility = sc.nextLine();
            Double totalBill = sc.nextDouble();
			sc.nextLine();
            h[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }

        String m = sc.nextLine();
        String w = sc.nextLine();
		m = m.toLowerCase();

        int r = noOfRoomsBookedInGivenMonth(h, m);
        int id = searchHotelByWifiOption(h, w);

        if (r == 0) 
		{
            System.out.println("No rooms booked in the given month");
        } 
		else 
		{
            System.out.println(r);
        }

        if (id == 0) 
		{
            System.out.println("No such option available");
        } 
		else 
		{
            System.out.println(id);
        }
    }
}