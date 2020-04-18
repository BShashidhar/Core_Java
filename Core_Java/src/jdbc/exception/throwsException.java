package jdbc.exception;

/**
 * @author B Shashidhar
 *
 * 
 */
public class throwsException {
public static boolean opnFile()
{
	int i=(int)(Math.random()*10);

	if(i<3){
		return true;
	}
	else{
		return false;
	}	
}
public void checkS() throws filenotfound,fileIsnotOpened
{
	if(opnFile())
	{
		throw new  fileIsnotOpened();
	}
	else 
	{
		throw new filenotfound();
	}
}
public static void main(String[] args)
{
	throwsException th=new throwsException();
	try {
		th.checkS();
	} catch (filenotfound  e) {
		// TODO Auto-generated catch block
		e.filenotfound();
	}
	catch(fileIsnotOpened e)
	{
		e.fileIsnotOpened();
	}
}

}
