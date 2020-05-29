package org.example;

import org.example.bean.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product=context.getBean("theProduct",Product.class);
        System.out.println(product);
    }
}
