package numbers;
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in: ");
		int in=sc.nextInt();
		int fac=1;
		for(int i=1;i<=in;i++)
		{
			fac=fac*i;
			
		}
		System.out.println(fac);
		
	}
}