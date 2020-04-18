package atmApp;
// Withdrawal.java

// Represents a withdrawal ATM transaction

public class Withdrawal extends Transaction {
	private int amount; // amount to withdraw
	private Keypad keypad; // reference to keypad
	private CashDispenser cashDispenser; // reference to cash dispenser

	// constant corresponding to menu option to cancel
	private final static int CANCELED = 6;

	// Withdrawal constructor
	public Withdrawal(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad,
			CashDispenser atmCashDispenser) {
		// initialize superclass variables
		super(userAccountNumber, atmScreen, atmBankDatabase);

		// initialize references to keypad and cash dispenser
		keypad = atmKeypad;
		cashDispenser = atmCashDispenser;
	} // end Withdrawal constructor

	// perform transaction
	@Override
	public void execute() {
		boolean cashDispensed = false; // cash was not dispensed yet
		double availableBalance; // amount available for withdrawal

		// get references to bank database and screen
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();

		// loop until cash is dispensed or the user cancels
		do {
			// obtain a chosen withdrawal amount from the user
			amount = displayMenuOfAmounts();

			// check whether user chose a withdrawal amount or canceled
			if (amount != CANCELED) {
				// get available balance of account involved
				availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

				// check whether the user has enough money in the account
				if (amount <= availableBalance) {
					// check whether the cash dispenser has enough money
					if (cashDispenser.isSufficientCashAvailable(amount)) {
						// update the account involved to reflect the withdrawal
						bankDatabase.debit(getAccountNumber(), amount);

						cashDispenser.dispenseCash(amount); // dispense cash
						cashDispensed = true; // cash was dispensed

						// instruct user to take cash
						screen.displayMessageLine("\nYour cash has been" + " dispensed. Please take your cash now.");
					} // end if
					else // cash dispenser does not have enough cash
						screen.displayMessageLine(
								"\nInsufficient cash available in the ATM." + "\n\nPlease choose a smaller amount.");
				} // end if
				else // not enough money available in user's account
				{
					screen.displayMessageLine(
							"\nInsufficient funds in your account." + "\n\nPlease choose a smaller amount.");
				} // end else
			} // end if
			else // user chose cancel menu option
			{
				screen.displayMessageLine("\nCanceling transaction...");
				return; // return to main menu because user canceled
			} // end else
		} while (!cashDispensed);

	} // end method execute

	// display a menu of withdrawal amounts and the option to cancel;
	// return the chosen amount or 0 if the user chooses to cancel
	private int displayMenuOfAmounts() {
		int userChoice = 0; // local variable to store return value

		Screen screen = getScreen(); // get screen reference

		// array of amounts to correspond to menu numbers
		// int[] amounts = { 0, 20, 40, 60, 100, 200 };

		// loop while no valid choice has been made

		// display the menu
		screen.displayMessageLine("\nWithdrawal Menu:");

		screen.displayMessage("\nChoose a withdrawal amount: ");

		int input = keypad.getInput(); // get user input through keypad
		if (input != 0) {
			userChoice = input;// save user's choice
		} else {
			userChoice = CANCELED;
		}
		// determine how to proceed based on the input value
		// end switch
		// end while

		return userChoice; // return withdrawal amount or CANCELED
	} // end method displayMenuOfAmounts
} // end class Withdrawal
