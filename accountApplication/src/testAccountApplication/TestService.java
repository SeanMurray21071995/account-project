package testAccountApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import accountApplication.Account;
import accountApplication.Service;

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
		serv.addAccount(acc);
		assertEquals("did not retriev the data from the hash map", serv.getAccount(1),acc);
	}


	@Test
	public void testTestFirstNameCount() 
	{
		
		assertEquals("didn't get the correct count",serv.getFirstNameCount("test"),1);
	} 
}
