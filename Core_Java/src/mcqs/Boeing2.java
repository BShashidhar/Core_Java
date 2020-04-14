package mcqs;

public class Boeing2 {

	public static void main(String[] args) {
		String inp="A";
		String out="";
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < 3; i++) {
			out=inp+inp;
			sb.append(inp).append(inp);
		}
		System.out.println(out);
		System.out.println(sb);

	}

}
