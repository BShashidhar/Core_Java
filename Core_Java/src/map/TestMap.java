package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap {
	public static void main(String[] args)
	{
		Map<String, Object> m=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int a;
		do
		{
			System.out.println("1)add\n2)modify\n3)view all\n4)exit");
			a=sc.nextInt();
			switch(a)
			{
			case 1:System.out.println("1)circle\n2)rectangle");
				int b=sc.nextInt();
				switch(b)
				{
					case 1:
						System.out.println("enter radius to add");
						int val=sc.nextInt();
						Circle c=new Circle();
						c.setRadius(val);
						m.put("circle", c);
						System.out.println(c.getRadius());
						break;
					case 2:
						System.out.println("enter length and breadth to add");
						int length=sc.nextInt();
						int breadth=sc.nextInt();
						Rectangle r1=new Rectangle(length,breadth);
						m.put("rectangle", r1);
						System.out.println(r1.getLength());
						System.out.println(r1.getBreadth());
						
						break;
				}
				break;
				case 2:System.out.println("Add key to modify");
				String mod=sc.next();
				Object o=m.get(mod);
				if(o instanceof Circle)
				{
					Circle c=(Circle)o;
					System.out.println("enter new value");
					int newmod=sc.nextInt();
					c.setRadius(newmod);
					System.out.println(c);
				}
				else if(o instanceof Rectangle)
				{
					Rectangle r=(Rectangle)o;
					System.out.println("enter new length of rectangle ");
					int newlen=sc.nextInt();
					System.out.println("enter new breadth of rectangle");
					int newbre=sc.nextInt();
					r.setLength(newlen);
					r.setBreadth(newbre);
					System.out.println(r);
				}
				else
				{
					System.out.println("key does not match");
				}
			
				break;
				case 3:System.out.println("enter key to get values");
				String key=sc.next();
				Object obj=m.get(key);
				if(obj instanceof Circle) {
					Circle c=(Circle)obj;
					System.out.println(c.getPerimeter());
				}
				else if(obj instanceof Rectangle)
				{
					Rectangle r=(Rectangle)obj;
					System.out.println(r.getPerimeter());
				}
				else
				{
					System.out.println("key does not match");
				}
			}
			
		}while(a!=4);
		/*Map<String, Object> m=new HashMap<>();
		m.put("circle", new Circle(10));
		Object value=m.get("circle");
		System.out.println(value);*/
		//System.out.println(m);
	}

}
