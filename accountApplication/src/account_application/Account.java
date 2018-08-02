package account_application;

import org.json.JSONObject;

public class Account {
	private String firstName; 
	private String secondName; 
	private int accountNumber;
	
	public Account (String firstName, String secondName, int accountNumber) 
	{
		setFirstName(firstName);
		setSecondName(secondName);
		setAccountNumber(accountNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() 
	{
		return this.firstName+" "+this.secondName+" "+this.accountNumber;
	}
	
	public JSONObject toJSONObject() 
	{	
		JSONObject accountReturn = new JSONObject();
		accountReturn.put("firstName", this.firstName);
		accountReturn.put("secondName", this.secondName);
		accountReturn.put("accountNumber", this.accountNumber);
		return accountReturn;	
	}
}
