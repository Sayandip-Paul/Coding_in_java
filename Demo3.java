/*
Write a Java program to implement a simple calculator. The program should prompt the user to enter 
two numbers and an operator (+, -, *, or /) and then perform the corresponding operation and 
display the result.

For example, if the user enters 4, 5, and +, the program should display 9 as the result. 
Similarly, if the user enters 10, 3, and *, the program should display 30 as the result.

Your program should handle invalid inputs gracefully, for example, if the user enters an operator 
that is not one of the four allowed operators or if the user enters non-numeric inputs. 
*/
import java.util.*;
public class Demo3
{
    public static void main(String args[])
    {
        System.out.println("Please enter two numbers followed by an operator");
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String op = sc.nextLine();
        
        int x = 0;
        int y = 0;
        try
        {
            x = Integer.parseInt(num1);
            y = Integer.parseInt(num2);
        }
        catch(Exception e)
        {
            System.out.println("Please enter numeric inputs");
            System.exit(0);
        }

        switch(op)
        {
            case "+":
            {
                System.out.println(x + y);
                break;
            }

            case "-":
            {
                System.out.println(x - y);
                break;
            }

            case "*":
            {
                System.out.println(x * y);
                break;
            }

            case "/":
            {
                System.out.println(x / y);
                break;
            }

            default:
                System.out.println("Invalid Operation");
        }
    }
}