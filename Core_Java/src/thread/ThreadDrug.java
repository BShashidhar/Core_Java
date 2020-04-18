package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDrug {
	public static void main(String[] args) {

		
		int x[]=new int[10];
		int y[]=new int[10];
		
		for (int k = 0; k < x.length; k++) {
			
			int j = (int) (Math.random() * 10) + 10;
			x[k] = j;
			System.out.print(x[k]+" ");
			
		}
		System.out.println();
		for (int k = 0; k < y.length; k++) {
			int i = (int) (Math.random() * 10) + 10;
			y[k] = i;
			System.out.print(y[k]+" ");
		}
		System.out.println();
		
		
		
		// int x[]= {1,5,3,6,18};
		// int y[]= {90,120,140};
		ExecutorService e = Executors.newFixedThreadPool(4);
		Callable<Integer> c = new getMaxValue(x);
		Callable<Integer> c1 = new getMinValue(y);
		Future<Integer> r1 = e.submit(c);
		Future<Integer> r2 = e.submit(c1);
		try {
			int result;
			if (r1.get() > r2.get()) {
				result = r1.get();
			} else {
				result = r2.get();
			}
			System.out.println(r1.get());
			System.out.println(r2.get());
			System.out.println(result);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
