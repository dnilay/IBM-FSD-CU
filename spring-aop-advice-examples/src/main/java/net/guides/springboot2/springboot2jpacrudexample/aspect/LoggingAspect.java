package net.guides.springboot2.springboot2jpacrudexample.aspect;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Before("execution(* net.guides.springboot2.springboot2jpacrudexample.service.EmployeeService.addEmployee(..))")
	public void logBefore(JoinPoint joinPoint) {
		log.debug("logBefore running .....");

	}
	@After("execution(* net.guides.springboot2.springboot2jpacrudexample.service.EmployeeService.addEmployee(..))")
	public void logAfter(JoinPoint joinPoint) {
		log.debug("logAfter running .....");

	}
	@AfterReturning(pointcut = "execution(* net.guides.springboot2.springboot2jpacrudexample.service.EmployeeService.deleteEmployee(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		log.debug("logAfterReturning running .....");


	}


	@Around("execution(* net.guides.springboot2.springboot2jpacrudexample.service.EmployeeService.getEmployeeById(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		log.debug("logAround running .....");

		try {
			Object result = joinPoint.proceed();
			return result;
		} catch (IllegalArgumentException e) {

			throw e;
		}

	}

	@AfterThrowing(pointcut = "execution(* net.guides.springboot2.springboot2jpacrudexample.service.EmployeeService.updateEmployee(..))", throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		log.debug("logAfterThrowing running .....");

	}
}
