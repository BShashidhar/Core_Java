package thread;

import java.util.concurrent.Callable;

public class getMaxValue implements Callable<Integer> {

	int maxvalue;
	 public getMaxValue(int[] x) {
		getMaxvalue(x);
	}
	
	private int  getMaxvalue(int[] x) {
		maxvalue=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>maxvalue)
			{
				maxvalue=x[i];
			}
		}
		return maxvalue;
	}

	public Integer call() throws Exception {
		int z=maxvalue;
		return z;
		
		
	}

}
