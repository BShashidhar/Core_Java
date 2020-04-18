package reflection;

import java.util.ResourceBundle;

public class Ref 
{
	public static void main(String[] args) 
	{
		Sort s=null;
		ResourceBundle r=ResourceBundle.getBundle("Hello");
		String s1=r.getString("scrap");
		
			Class c;
			try {
				c = Class.forName(s1);
				Object o = c.newInstance();
				s=(Sort) o;
				s.sort();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}

}
