package org.example.service;

import org.example.entity.Item;

import java.sql.SQLException;

public interface ItemService {
    public Item createItem(Item item) throws SQLException;
}
