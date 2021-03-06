package test_account_application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import account_application.Account;
import account_application.Service;

public class TestService {
	private Service serv = new Service();
	private Account acc = new Account("test","test", 1);
	@Before
	public void setup() 
	{
		serv.addAccount(acc);
	}
	@Test 
	public void getAddAccount() 
	{
		assertEquals("did not retriev the data from the hash map", serv.getAccount(1),acc);
	}
	@Test
	public void testTestFirstNameCount() 
	{
		assertEquals("didn't get the correct count",serv.getFirstNameCount("test"),1);
	} 
	@Test
	public void testFirstNameMiss() 
	{
		assertEquals("went into the if statment",serv.getFirstNameCount("paul"),0);
	}
	@Test
	public void testJobj() 
	{
		assertNotNull("did not work",serv.jobj().get("1"));
	}
}
