package test_account_application;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import account_application.Account;

public class TestAccount {
	
	Account acc;
	@Before
	public void start() 
	{
		this.acc = new Account("test","test",1);
	}
	@Test
	public void testAccountGetFirstName() {
		assertEquals("Did not retrieve the first name",acc.getFirstName(),"test");
	}
	@Test 
	public void testAccountGetSecondName() 
	{
		assertEquals("Did not retrieve the second name",acc.getSecondName(),"test" );
	}
	@Test
	public void testAccountGetAccountNumber() 
	{
		assertEquals("Did not retrieve the account name",acc.getAccountNumber(),1);
	}
	@Test
	public void testToString() 
	{
		System.out.println(acc.toString());
		assertEquals("to string override did not work",acc.toString(),"test test 1");
	}
	@Test
	public void testToJsaon() 
	{
		JSONObject j = acc.toJSONObject();
		assertNotNull("didnt work",j.get("accountNumber"));
	}
}
