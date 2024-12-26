import java.util.*;
class Course
{
	private int courseId;
	private String courseName;
	private String courseAdmin;
	private int quiz;
	private int handson;
	
	public Course(int courseId,String courseName,String courseAdmin,int quiz,int handson)
	{
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseAdmin = courseAdmin;
		this.quiz = quiz;
		this.handson = handson;
	}
	
	public void setCourseId(int courseId)
	{
		this.courseId = courseId;
	}
	
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void setCourseAdmin(String courseAdmin)
	{
		this.courseAdmin = courseAdmin;
	}
	
	public void setQuiz(int quiz)
	{
		this.quiz = quiz;
	}
	
	public void setHandson(int handson)
	{
		this.handson = handson;
	}
	
	public int getCourseId()
	{
		return courseId;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public String getCourseAdmin()
	{
		return courseAdmin;
	}
	
	public int getQuiz()
	{
		return quiz;
	}
	
	public int getHandson()
	{
		return handson;
	}
}

class Solution
{
	public static int findAvgOfQuizByAdmin(Course obj[],String admin)
	{
		int s = 0;
		int cnt = 0;
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getCourseAdmin().equalsIgnoreCase(admin))
			{
				s = s + obj[i].getQuiz();
				cnt++;
			}
		}
		if(cnt == 0)
			return 0;
		else
			return s/cnt;
	}
	
	public static String sortCourseByHandsOn(Course obj[],int num)
	{
		List<Integer> m = new ArrayList<Integer>();
		String res = "";
		for(int i = 0; i < obj.length; i++)
		{
			if(obj[i].getHandson() < num)
			{
				m.add(obj[i].getHandson());
			}
		}
		m.sort(null);
		for(int i = 0; i < m.size(); i++)
		{
			for(int j = 0; j < obj.length; j++)
			{
				if(m.get(i) == obj[j].getHandson())
				{
					res = res + obj[j].getCourseName() + "\n";
				}
			}
		}
		
		if(res == "")
			return "No Course found with mentioned attribute.";
		else
			return res;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Course cs[] = new Course[n];
		for(int i = 0; i < n; i++)
		{
			int courseId = sc.nextInt();
			sc.nextLine();
			String courseName = sc.nextLine();
			String courseAdmin = sc.nextLine();
			int quiz = sc.nextInt();
			sc.nextLine();
			int handson = sc.nextInt();
			sc.nextLine();
			cs[i] = new Course(courseId,courseName,courseAdmin,quiz,handson);
		}
		String ad = sc.nextLine();
		int nm = sc.nextInt();
		int avg = findAvgOfQuizByAdmin(cs,ad);
		String r = sortCourseByHandsOn(cs,nm);
		if(avg == 0)
			System.out.println("No Course found.");
		else
			System.out.println(avg);
		
		System.out.println(r);
	}
}