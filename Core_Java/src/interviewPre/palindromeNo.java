package interviewPre;

public class palindromeNo {

	public static void main(String[] args) {
		int num=121;
		int rem=0,rev=0;
		int temp=num;
		while (num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (temp==rev) {
			System.out.println("P");
		}
		else {
			System.out.println("N P ");
		}

	}

}
