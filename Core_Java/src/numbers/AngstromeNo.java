package numbers;

public class AngstromeNo {
	public static void main(String[] args) {
		int n=153,sum=0,rem=0,temp=0;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)		
			System.out.println("is AngstromeNo");
		else
			System.out.println("is not a AngstromeNo");		
	}
}