import java.util.*;
class Movie
{
	private String movieName; 
	private String company;
	private String genre; 
	private int budget;
	
	public Movie(String movieName,String company,String genre,int budget)
	{
		this.movieName = movieName;
		this.company = company;
		this.genre = genre;
		this.budget = budget;
	}
	
	public String getMovieName()
	{
		return movieName;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public int getBudget()
	{
		return budget;
	}
}

class Solution
{
	public static Movie getMovieByGenre(Movie obj[],String g)
	{
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getGenre().equalsIgnoreCase(g))
			{
				return obj[i];
			}
		}
		return null;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Movie m[] = new Movie[4];
		for(int i = 0; i < m.length; i++)
		{
			String movieName = sc.nextLine();
			String company = sc.nextLine();
			String genre = sc.nextLine();
			int budget = sc.nextInt();
			sc.nextLine();
			m[i] = new Movie(movieName,company,genre,budget);
		}
		String gn = sc.nextLine();
		
		Movie ob = getMovieByGenre(m,gn);
		if(ob != null)
		{
			if(ob.getBudget() > 80000000)
				System.out.println("High Budget Movie");
			else
				System.out.println("Low Budget Movie");
		}
		else
			System.out.println("No Movie found with the defined genre");
	}
}