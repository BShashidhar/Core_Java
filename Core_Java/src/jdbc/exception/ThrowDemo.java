package jdbc.exception;


/**
 * @author B Shashidhar
 *
 * 
 */
public class ThrowDemo {
	
	public static  void Demo(int i)	{	
		try {				
				if(i>0)	{
					System.out.println(i);
					
				}else {
					throw new functionNotfound();
				}
			}
			catch (functionNotfound e) {
				
				e.message();
				
			}		
	}
	public static void main(String[] args){
		Demo(-9);		
	}
	
}
