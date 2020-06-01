package org.example;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("itemService")
public class ItemServiceImpl implements ItemService {
    private ItemDAO itemDAO;

    @Autowired
    public ItemServiceImpl(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @Override
    public Item createItem(Item item) throws SQLException {
        return itemDAO.createItem(item);
    }
}
