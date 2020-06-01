package org.example.dao;

import org.example.entity.Item;

import java.sql.SQLException;

public interface ItemDAO {
    public Item createItem(Item item) throws SQLException;
}
