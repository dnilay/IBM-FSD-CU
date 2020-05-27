package comm.example.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ORDER_TABLE")
public class Order {

    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "SHIPPING_ADDRESS")
    private String address;

	public Order(String address) {
		super();
		this.address = address;
	}

  

}
