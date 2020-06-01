package org.example;

import java.sql.SQLException;

public interface ItemService {
    public Item createItem(Item item) throws SQLException;
}
