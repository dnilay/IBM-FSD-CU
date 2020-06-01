package org.example;

import org.example.dao.ImageDAO;
import org.example.dao.ImageDAOImpl;
import org.example.dto.ImageDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ImageDAO imageDAO=context.getBean("imageDAO", ImageDAOImpl.class);
        ImageDto dto=imageDAO.createImage(new ImageDto(UUID.randomUUID().toString(),"demo url",false));
        System.out.println(dto);
    }
}
