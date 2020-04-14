package numbers;

public class PalindromeNo {
	public static void main(String[] args) {
		int num=121;
		int rem=0,sum=0,temp=0;
		temp=num;
		while (num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num/=10;
		}
		if(temp==sum)
		{
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
