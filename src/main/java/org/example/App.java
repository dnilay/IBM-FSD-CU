package org.example;

import java.sql.SQLException;
import java.util.UUID;

import org.example.entity.Item;
import org.example.service.ItemService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{

    public static void main( String[] args ) throws SQLException {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
           System.out.println(context);
            ItemService itemService = context.getBean("itemService", ItemService.class);
          Item item = itemService.createItem(new Item(UUID.randomUUID().toString(), "TV", 20000));
          System.out.println("Item saved successfully");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
