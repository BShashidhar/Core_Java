package designpatterns.structural.adapter;

/**
 * @author B Shashidhar
 *
 * 
 */
public class RectangularSocket {
	
	private String rectaStem1;
	private String rectaStem2;
	
	public void getPower() {
		RectangulerAdapter adapter = new RectangulerAdapter();
		adapter.adapt(rectaStem1, rectaStem2);
	}
}