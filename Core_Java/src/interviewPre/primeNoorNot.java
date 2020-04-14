package interviewPre;

public class primeNoorNot {
	public static void main(String[] args) {
		int num=7;
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if (num%i==0) {
				temp++;
			}
		}
		if (temp==0) 
			System.out.println(num+" is prime no");		
		else 
			System.out.println(num+" is not a prime no");
	}
}
