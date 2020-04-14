package designpatterns.structural.facade;

/**
 * @author B Shashidhar
 *
 * 
 */
public class FacadePattern{
	public static void main(String[] args) {
		BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
		serviceFacade.moneyTransfer();
	}

}