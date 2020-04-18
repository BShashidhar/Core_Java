package composition;

public class person {
	private job j;
	
	public person()
	{
		this.j=new job();
		j.setJobId(101);
		
	}
	public int getJobId()
	{
		//System.out.println(j.getJobId());
		return j.getJobId();

	}
	
	public static void main(String[] args)
	{
		person p=new person();
		System.out.println(p.getJobId());
	
	}

}
