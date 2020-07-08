package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	private Long startTime,endTime,result;

	@Before(value = "execution(* com.example.demo.service.EmployeeService.createEmployee(..)) && args(name,empId)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
		startTime=System.currentTimeMillis();
		System.out.println("start time: "+startTime+"ms");
	}

	@After(value = "execution(* com.example.demo.service.EmployeeService.createEmployee(..)) && args(name,empId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
		endTime=System.currentTimeMillis();
		System.out.println("end time: "+endTime+"ms");
		result=endTime-startTime;
		System.out.println("\n====>> time took to execute the method: "+result+"ms");
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);

	}
}
