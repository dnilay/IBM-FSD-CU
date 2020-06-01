package org.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.entity.Item;
import org.example.factory.ItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("itemDAO")
public class ItemDAOImpl implements ItemDAO {
    private ItemFactory itemFactory;
    private Connection connection;

    @Autowired
    public ItemDAOImpl(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    @Override
    public Item createItem(Item item) throws SQLException {
        connection=itemFactory.getMyConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("insert into item_table(id,name,price) values(?,?,?)");
        preparedStatement.setString(1, item.getItemID());
        preparedStatement.setString(2,item.getItemName());
        preparedStatement.setInt(3,item.getPrice());
        preparedStatement.executeUpdate();
        return item;
    }
}
