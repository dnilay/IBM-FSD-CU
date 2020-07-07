package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.example.Account;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
public class MyDemoLoggingAspect {
private Long result;
	@Before("execution(* org.example.dao.AccountDAO.findAccounts(..))")
	public void beforeReturningFindAccountsAdvice() {


		result=System.currentTimeMillis();
		System.out.println("\n=====>>> entry time is: " + result);
	}
    @AfterReturning("execution(* org.example.dao.AccountDAO.findAccounts(..))")
    public void afterReturningFindAccountsAdvice() {
		long result1=System.currentTimeMillis();
		System.out.println("\n=======>> exit time is"+result1);
		result=result1-result;
        System.out.println("\n=====>>> result is: " + result);


        System.out.println("\n=====>>> result is: " + result);

    }

}
	











