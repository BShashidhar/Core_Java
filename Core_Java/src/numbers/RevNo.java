package numbers;

public class RevNo {
	public static void main(String[] args) {
		int num=123456789;
		int rem=0,rev=0;
		while (num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
			
		}
		System.out.println(rev);
	}

}
