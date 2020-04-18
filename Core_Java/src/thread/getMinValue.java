package thread;

import java.util.concurrent.Callable;

public class getMinValue implements Callable<Integer> {

	int minvalue;
	 public getMinValue(int[] y) {
		getMaxvalue(y);
	}
	
	private int  getMaxvalue(int[] y) {
		minvalue=y[0];
		for(int i=0;i<y.length;i++)
		{
			if(y[i]<minvalue)
			{
				minvalue=y[i];
			}
		}
		return minvalue;
	}

	public Integer call() throws Exception {
		int z=minvalue;
		return z;
		
		
	}

}
