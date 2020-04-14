package interviewPre;

import java.util.Scanner;

public class boschProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1st No...");
		int in1 = sc.nextInt();
		System.out.println("2nd No...");
		int in2 = sc.nextInt();
		int rem1, rem2, rev1 = 0, rev2 = 0;
		while (in1 > 0 && in2 > 0) {
			rem1 = in1 % 10;
			rem2 = in2 % 10;
			rev1 = rev1 * 10 + rem1;
			rev2 = rev2 * 10 + rem2;
			in1 = in1 / 10;			
			in2 = in2 / 10;
		}
		System.out.println(rev1 - rev2);
	}
}
