package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER_TABLE")
public class Order {

    @Id
    @Column(name = "ORDER_ID")
    private String id;
    @Column(name = "SHIPPING_ADDRESS")
    private String address;



}
