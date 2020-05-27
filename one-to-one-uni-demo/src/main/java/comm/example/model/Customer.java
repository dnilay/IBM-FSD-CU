package comm.example.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER_TABLE")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String name;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID_FK")
    private Order order;
	
    
public String getDetails()
{
	return "order placed sucessfully with the bellow details\n Customer ID:"+getId()+" Customrr NameL: "+getName()
	+" Order Id: "+order.getId()+" Address:"+order.getAddress();
}


public Customer(String name) {
	super();
	this.name = name;
}
  

}
