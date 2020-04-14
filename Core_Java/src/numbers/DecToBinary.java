package numbers;

public class DecToBinary {
	public static void main(String[] args) {
		int num=23,rem=0;
		String bin=" ";
		while (num>0) {
			rem=num%2;
			bin=rem+bin;
			num/=2;		
			
		}
		System.out.println(bin);
	}

}
