package account_application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONObject;

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
	
	public JSONObject jobj() 
	{
		//Iterator<Entry<Integer, Account>> it = accounts.entrySet().iterator();
		JSONObject accountReturn = new JSONObject(accounts);
	/*	while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getVale());
	        accountReturn.put( pair.getKey().toString(), ((Account) pair.getValue()).toJSONObject());
		}*/
		return accountReturn;	
	} 
	 
	public int getFirstNameCount(String lookForName) 
	{
		int count = 0;
		Iterator<Entry<Integer, Account>> it = accounts.entrySet().iterator();
		while(it.hasNext()) 
		{
			Map.Entry<Integer, Account> entry = (Map.Entry<Integer, Account>)it.next();
		 	if((((Account)entry.getValue()).getFirstName()).equals(lookForName)) 
			{ 
				count++;
			} 
		}
		return count;
	}
	
}
