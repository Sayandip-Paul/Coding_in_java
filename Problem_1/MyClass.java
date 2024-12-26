/*Question
Write main method in Solution class.
In the main method, read a String value and print the count of lower case characters 
present in the input String value. If no lower case characters are present in the String value 
then it should print "No lower case characters present" as a String.
Sample input1:
Xplore
Output:
4
Sample input2:
XPLORE
to be Circulate
Output:
No lower case characters present
Sample code snippet for reference:
Please use below code to build your MyClass.

public class MyClass
{
}
public static void main(String[] args)
Restricted for circulation outside TCS Xplore
{
}
//code to read values
//code to display the result

*/
import java.util.Scanner;
public class MyClass
{
    public static void main(String args[])
    {
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int str_len = str.replaceAll("[^a-z]","").length();

        if(str_len == 0)
            System.out.println("No lower case characters present");
        else
            System.out.println(str_len);

        sc.close();
    }
}
