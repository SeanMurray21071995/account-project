package accountApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
		Iterator it = accounts.entrySet().iterator();
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
		Iterator it = accounts.entrySet().iterator();
		while(it.hasNext()) 
		{
			Map.Entry entry = (Map.Entry)it.next();
		 	if((((Account)entry.getValue()).getFirstName()).equals(lookForName)) 
			{ 
				count = count +1;
			}
		}
		return count;
	}
	
}
