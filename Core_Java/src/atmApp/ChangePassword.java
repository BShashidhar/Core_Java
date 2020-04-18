package atmApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class ChangePassword extends Transaction {
	private int pin; // amount to deposit
	private int npin;
	private Keypad keypad; // reference to keypad
	private final static int CANCELED = 0; // constant for cancel option
	atmApp.Account accnum;
	private int userAccountNumber;

	public ChangePassword(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad keypad2) {
		super(userAccountNumber, atmScreen, atmBankDatabase);
		// TODO Auto-generated constructor stub
		keypad = keypad2;
		this.userAccountNumber = userAccountNumber;

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();

		screen.displayMessageLine("enter existing pin");
		pin = keypad.getInput();
		accnum = bankDatabase.getMypin(pin, userAccountNumber);
		if (accnum != null) {

			screen.displayMessageLine("enter new pin");
			npin = keypad.getInput();

			accnum.setPin(npin);
			try {
				List<atmApp.Account> a = bankDatabase.getAccounts();
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ab.ser"));
				os.writeObject(a);
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			screen.displayMessageLine(" wrong pin");
		}

	}

}
