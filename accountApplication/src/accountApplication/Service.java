package accountApplication;

import java.util.HashMap;

public class Service {
	
	private HashMap<Integer, Account> accounts = new HashMap<>();
	
	public void addAccount(Account acc) 
	{	
		accounts.put(acc.getAccountNumber(), acc);
	}
	public Account getAccount(int accountNumber) 
	{
		return accounts.get(accountNumber);
	}
}
