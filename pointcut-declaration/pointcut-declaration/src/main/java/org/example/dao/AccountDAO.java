package org.example.dao;

import org.example.Account;
import org.springframework.stereotype.Component;


@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ": doWork()");
		return false;
	}
	public void testMe()
	{
		System.out.println(getClass()+":testMe()");
	}
}





