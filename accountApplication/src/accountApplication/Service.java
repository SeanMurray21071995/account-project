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
		JSONObject accountReturn = new JSONObject();
		while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        accountReturn.put( pair.getKey().toString(), ((Account) pair.getValue()).toJSONObject());
		}
		
		return accountReturn;	
	}
}
