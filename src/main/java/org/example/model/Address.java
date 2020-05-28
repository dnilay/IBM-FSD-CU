package org.example.model;

import lombok.*;

import javax.persistence.Embeddable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class Address {
    private String country;
    private String state;
    private String city;
    private String phoneNumber;
}
