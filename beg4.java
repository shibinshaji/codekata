import java.util.Scanner;
class beg4{

    public static void main(String[] args)
    {
            
       Scanner input = new Scanner(System.in);
       char ch = input.next().charAt(0);	
	if((ch >= 'a' && ch <= 'z')|| (ch >= 'A' && ch <= 'Z'))
                		System.out.println("Alphabet");
	else
		System.out.println("No");
        
    }
}
