package designpatterns.structural.facade;

/**
 * @author B Shashidhar
 *
 * 
 */
public class AccountService {

	public static Account getAccount(String accountId) {
		return new SavingAccount();
	}
}