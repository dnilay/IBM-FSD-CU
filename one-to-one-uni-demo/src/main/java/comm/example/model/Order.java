package comm.example.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "ORDER_TABLE")
public class Order {

    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "SHIPPING_ADDRESS")
    private String address;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "order")
    private Customer customer;
	

	public String getDetails()
	{
		return "address: "+getAddress()+ " customer name:"+customer.getName()+" customer id: "+customer.getId();
	}


	public Order(String address) {
		super();
		this.address = address;
	}


	public Order() {
		super();
	}

}
