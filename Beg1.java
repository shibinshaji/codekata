import java.util.*;
import java.io.*;
class Beg1
{
    public static void main(String[] args)
    {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.println("input:\n");
        number=s.nextInt();
        System.out.println(number);
       
        if (number < 0)
        {
            System.out.println("\noutput:\n");
            System.out.println("Negative");
        }
        else if(number > 0)
        {
         System.out.println("\noutput:\n");
         System.out.println("Positive");  
        }
        else
        {
            System.out.println("\noutput:\n");
            System.out.println("Zero");
        }
    }
}

