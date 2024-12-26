import java.util.*;
class Student
{
	private int rollNo;
	private String name;
	private String subject;
	private String grade;
	private String date;
	
	public Student(int rollNo,String name,String subject,String grade,String date)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
		this.grade = grade;
		this.date = date;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public String getDate()
	{
		return date;
	}
}

class Solution
{
	public static List<Integer> findStudentByGradeAndMonth(Student obj[],String g,String m)
	{
		List<Integer> id = new ArrayList<Integer>();
		//String n[];
		for(int i = 0; i < obj.length; i++)
		{
			if(((obj[i].getDate().split("/")[1]).equals(m)) && (obj[i].getGrade().equalsIgnoreCase(g)))
			{
				id.add(obj[i].getRollNo());
			}
		}
		id.sort(null);
		if(id.size() == 0)
			return null;
		else
			return id;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> r = new ArrayList<Integer>();
		Student stud[] = new Student[4];
		for(int i = 0; i < stud.length; i++)
		{
			int rollNo = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String subject = sc.nextLine();
			String grade = sc.nextLine();
			String date = sc.nextLine();
			stud[i] = new Student(rollNo,name,subject,grade,date);
		}
		String g = sc.nextLine(); 
		String m = sc.nextLine();
		if(m.length() == 1)
			m = "0" + m;
			
		r = findStudentByGradeAndMonth(stud,g,m);
		if(r != null)
		{
			for(int each: r)
			{
				for(int i = 0; i < stud.length; i++)
				{
					if(stud[i].getRollNo() == each)
					{
						System.out.println(stud[i].getName());
						System.out.println(stud[i].getSubject());
					}
				}
			}
			System.out.println(r.size());
		}
		else
			System.out.println("No student found");
	}
}