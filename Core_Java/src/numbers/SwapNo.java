package numbers;

public class SwapNo {
	public static void main(String[] args) {
		int i1=10;
		int i2=20;
		System.out.println("Before swap: "+i1+" "+i2);
		i1=i1^i2;
		i2=i1^i2;
		i1=i1^i2;
		System.out.println("After swap: "+i1+" "+i2);
	}

}
