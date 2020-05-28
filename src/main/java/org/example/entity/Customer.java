package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.CascadeType.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER_TABLE")
public class Customer{

    @Id
    private String id;
    private String name;
    @OneToMany(cascade=ALL,fetch = FetchType.LAZY)
    private List<Order> orders;

}
