package designpatterns.structural.facade;

/**
 * @author B Shashidhar
 *
 * 
 */
public class SavingAccount implements Account {

	@Override
	public void accountType() {
		System.out.println("SAVING ACCOUNT");
	}

}
