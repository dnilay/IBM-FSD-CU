package org.example;

import java.sql.SQLException;

public interface ItemDAO {
    public Item createItem(Item item) throws SQLException;
}
