package oops.polymarphisam;

public class MethodOverLoading {
	public static int add(int a,int b) {
		int result=a+b;
		System.out.println(result);
		return result;		
	}
	public static double add(int a,double b) {
		double result=a+b;
		System.out.println(result);
		return result;		
	}
	public static String add(String a,String b) {
		String result=a+b;
		System.out.println(result);
		return result;		
	}

	public static void main(String[] args) {
		
		add(1,2);
		add(10,1.2345);
		add("Shashidhar ","is a boy");

	}
}
