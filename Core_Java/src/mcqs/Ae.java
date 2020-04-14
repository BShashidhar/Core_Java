package mcqs;

public class Ae {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			String x = null;
			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println(3);
		} catch (NullPointerException ne) {
			System.out.println(6);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
	}
}
