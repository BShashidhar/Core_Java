package atmApp;
// Account.java

// Represents a bank account

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		// System.out.println("natural sort");

		return getPin() - o.getPin();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj instanceof Account) {
			Account temp = (Account) obj;
			if (getAccountNumber() == temp.getAccountNumber()) {
				return true;

			} else
				return false;

		} else
			return false;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	private int accountNumber; // account number
	private int pin; // PIN for authentication
	private double availableBalance; // funds available for withdrawal
	private double totalBalance; // funds available + pending deposits

	// Account constructor initializes attributes
	public Account(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
		accountNumber = theAccountNumber;
		pin = thePIN;
		availableBalance = theAvailableBalance;
		totalBalance = theTotalBalance;
	} // end Account constructor

	public Account(int userAccountNumber, int userPIN) {
		// TODO Auto-generated constructor stub
		accountNumber = userAccountNumber;
		pin = userPIN;
	}

// determines whether a user-specified PIN matches PIN in Account
	public boolean validatePIN(int userPIN, List<Account> accounts, int i2) {

		Account userAccount = accounts.get(i2);
		System.out.println(userAccount.getPin() + "" + userPIN);
		// return current account if match found
		if (userAccount.getPin() == userPIN)
			return true;
		else
			return false;

		/*
		 * if ( userPIN == pin ) return true; else return false; } // end method
		 * validatePIN
		 */
	}

	// returns available balance
	public double getAvailableBalance() {
		return availableBalance;
	} // end getAvailableBalance

	// returns the total balance
	public double getTotalBalance() {
		return totalBalance;
	} // end method getTotalBalance

	// credits an amount to the account
	public void credit(double amount) {
		totalBalance += amount; // add to total balance
	} // end method credit

	// debits an amount from the account
	public void debit(double amount) {
		availableBalance -= amount; // subtract from available balance
		totalBalance -= amount; // subtract from total balance
	} // end method debit

	// returns account number
	public int getAccountNumber() {
		return accountNumber;
	} // end method getAccountNumber

} // end class Account
