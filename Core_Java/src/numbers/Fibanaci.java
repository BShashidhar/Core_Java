package numbers;
import java.util.Scanner;
public class Fibanaci {
	public static void main(String[] args) {
		int in1=0,in2=1,in3=1;
		System.out.print(in1+" "+in2+" "+in3);
		for(int i=2;i<=7;i++)
		{
				in1=in2;
				in2=in3;
				in3=in1+in2;
				System.out.print(" "+in3);
		}
	}
}