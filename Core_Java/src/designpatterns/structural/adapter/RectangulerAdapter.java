package designpatterns.structural.adapter;

/**
 * @author B Shashidhar
 *
 * 
 */
public class RectangulerAdapter {
	
	private CylindricalSocket socket = new CylindricalSocket();
	
	public void adapt(String rectaStem1, String rectaStem2) {
		//some conversion logic
	    String cylinStem1 = rectaStem1;
	    String cylinStem2 = rectaStem2;
	    socket.supply(cylinStem1, cylinStem2);
	}
}
