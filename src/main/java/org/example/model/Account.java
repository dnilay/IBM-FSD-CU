package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @Column(name = "account_id")
    private String accountID;
    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private AccountType accountType;
    @Column(name = "account_balance")
    private double balance;
    @Column(name = "account_is_active")
    private boolean isActive;
    @OneToOne(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Employee employee;
}
