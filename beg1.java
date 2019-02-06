import java.util.*;
import java.io.*;
public class beg1
{
    public static void main(String[] args)
    {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.println("input:");
        number=s.nextInt();
      
       
        if (number < 0)
        {
            System.out.println("\noutput:");
            System.out.println("Negative");
        }
        else if(number > 0)
        {
         System.out.println("\noutput:");
         System.out.println("Positive");  
        }
        else
        {
            System.out.println("\noutput:");
            System.out.println("Zero");
        }
    }
}
