package numbers;

public class PrimeNo {
	public static void main(String[] args) {
		int num=6,count=0;
		for (int i = 0; i < num; i++) {
			if(num%2==0)
			{
				count++;
			}			
		}
		if(count==0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
