import java.text.*;
import java.util.*;

public class currencyFormatter 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + nf.format(num));
        @SuppressWarnings("deprecation")
        Locale ind = new Locale("en","IN");
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(ind);
        System.out.println("India: " + nf2.format(num));
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nf3.format(num));
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nf4.format(num));        
    }
}

