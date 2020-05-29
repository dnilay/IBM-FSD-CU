package com.mycompany.spring_demo_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_demo_3.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee employee=context.getBean("e",Employee.class);
    	System.out.println(employee);
    }
}
