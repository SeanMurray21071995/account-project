package testAccountApplication;

import static org.junit.Assert.*;

import org.junit.Test;

import accountApplication.Account;
import accountApplication.Service;

public class TestService {
	@Test 
	public void getAddAccount() 
	{
		Service serv = new Service();
		Account acc = new Account("test","test", 1);
		serv.addAccount(acc);
		assertEquals("did not retriev the data from the hash map", serv.getAccount(1),acc);
	}
}
