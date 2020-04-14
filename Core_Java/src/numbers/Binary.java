package numbers;
public class Binary
{
	public static void main(String[] args)
	{
		int in=39,rem=0,bin=0,rev=0;
		while(in>0)
		{
			rem=in%2;
			bin=bin*10+rem;		
			in/=2;			
		}
		
		while(bin>0)
		{
			rem=bin%10;
			rev=rev*10+rem;
			bin/=10;
		}
		System.out.print(rev);
		
	}
}