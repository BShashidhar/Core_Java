package interviewPre;

public class fibanaci {
	public static void main(String[] args) {
		int x=0,y=1,z=1;
		int n=10;
		System.out.print(x+" "+y+" "+z+" ");
		for (int i = 0; i < n; i++) {
			x=y;
			y=z;
			z=x+y;
			System.out.print(z+" ");
		}
	}

}
