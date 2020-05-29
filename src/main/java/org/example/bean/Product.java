package org.example.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private String productID;
    private String productName;
    private double productPrice;


}
