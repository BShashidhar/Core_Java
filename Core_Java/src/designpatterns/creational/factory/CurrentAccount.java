/**
 * 
 */
package designpatterns.creational.factory;

/**
 * @author B Shashidhar
 *
 * 
 */
public class CurrentAccount implements Account {
	@Override
	public void accountType() {
		System.out.println("CURRENT ACCOUNT");
	}
}
